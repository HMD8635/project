package com.kgc.u2.JDBC.work;

import com.kgc.u2.JDBC.work.impl.Studentimpl;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class StudentDAO implements Studentimpl {
    QueryRunner qr=new QueryRunner(new ComboPooledDataSource());

    @Override
    public List<Student> query() throws SQLException {
        String sql= " select * from students ";
        List<Student> studentList = qr.query(sql, new BeanListHandler<Student>(Student.class));
        return studentList;
    }

    @Override
    public void delete(int id) throws SQLException {
        String sql=" delete from students where id=? ";
        qr.execute(sql,id);
    }

    @Override
    public void update(Student student, int id) throws SQLException {
        String sql=" update students set id=?, name=?,sex=?,add1=? where id=? ";
        qr.update(sql,student.getId(),student.getName(),student.getSex(),student.getAdd1(),id);
    }

    @Override
    public void add(Student student) throws SQLException {
        String sql=" insert into students(id,name,sex,add1) values(?,?,?,?) ";
        qr.insert(sql,new BeanHandler<>(Student.class),student.getId(), student.getName(), student.getSex(), student.getAdd1());
    }
}
