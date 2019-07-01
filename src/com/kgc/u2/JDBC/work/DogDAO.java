package com.kgc.u2.JDBC.work;

import com.kgc.u2.JDBC.work.impl.Dogimpl;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class DogDAO implements Dogimpl {
    QueryRunner qr=new QueryRunner(new ComboPooledDataSource());

    @Override
    public List<Dog> query() throws SQLException {
        String sql =" select * from dog ";
        List<Dog> dogList = qr.query(sql, new BeanListHandler<Dog>(Dog.class));
        return dogList;
    }

    @Override
    public void delete(int id) throws SQLException {
        String sql = " delete from dog where id=? ";
        qr.execute(sql,id);
    }

    @Override
    public void update(Dog dog, int id) throws SQLException {
        String sql =" update dog set id=?,type=?,color=?,age=? where id=? ";
        qr.update(sql,dog.getId(),dog.getType(),dog.getColor(),dog.getAge(),id);
    }

    @Override
    public void add(Dog dog) throws SQLException {
        String sql =" insert into dog(id,type,color,age) values(?,?,?,?) ";
        qr.insert(sql,new BeanListHandler<Dog>(Dog.class),
                dog.getId(),dog.getType(),dog.getColor(),dog.getAge());
    }
}
