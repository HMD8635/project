package com.kgc.u2.JDBC.work;

import com.kgc.u2.JDBC.work.impl.Bookimpl;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import java.sql.SQLException;
import java.util.List;


public class BookDAO implements Bookimpl {
    private QueryRunner qr=new QueryRunner(new ComboPooledDataSource());

    //查询
    @Override
    public List<Book> query() throws SQLException {
        String sql=" select * from books ";
        List<Book> bookList = qr.query(sql, new BeanListHandler<Book>(Book.class));
        return bookList;
    }
    //修改
    @Override
    public void update(Book book,int id) throws SQLException {
        String sql=" update books set id=?,name=?,author=?,inventory=? where id=? ";
        qr.update(sql,book.getId(),book.getName(),book.getAuthor(),book.getInventory(),id);
    }
    //删除
    @Override
    public void delete(int id) throws SQLException {
        String sql=" delete from books where id=? ";
        qr.execute(sql,id);
    }
    //添加
    @Override
    public void add(Book book) throws SQLException {
        String sql =" insert into books(id,name,author,inventory) values(?,?,?,?) ";
        qr.insert(sql,new BeanListHandler<Book>(Book.class),
                book.getId(),book.getName(),book.getAuthor(),book.getInventory());
    }
}
