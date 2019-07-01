package com.kgc.u2.JDBC.work;

import com.kgc.u2.JDBC.work.impl.Waresimpl;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class WaresDAO implements Waresimpl {
    QueryRunner qr=new QueryRunner(new ComboPooledDataSource());

    @Override
    public void add(Wares wares) throws SQLException {
        String sql =" insert into wares(id,name,type,price) values(?,?,?,?) ";
        qr.insert(sql,new BeanListHandler<Wares>(Wares.class),
                wares.getId(),wares.getName(),wares.getType(),wares.getPrice());
    }

    @Override
    public void delete(int id) throws SQLException {
        String sql =" delete from wares where id=? ";
        qr.execute(sql,id);
    }

    @Override
    public void update(Wares wares, int id) throws SQLException {
        String sql =" update wares set id=?,name=?,type=?,price=?  where id=? ";
        qr.update(sql,wares.getId(),wares.getName(),wares.getType(),wares.getPrice(),id);
    }

    @Override
    public List<Wares> query() throws SQLException {
        String sql=" select * from wares ";
        List<Wares> waresList = qr.query(sql, new BeanListHandler<Wares>(Wares.class));
        return waresList;
    }
}
