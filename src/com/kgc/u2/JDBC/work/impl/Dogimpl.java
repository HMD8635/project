package com.kgc.u2.JDBC.work.impl;

import com.kgc.u2.JDBC.work.Dog;

import java.sql.SQLException;
import java.util.List;

public interface Dogimpl {
    //查询
    List<Dog> query() throws SQLException;
    //删除
    void delete(int id) throws SQLException;
    //修改
    void update(Dog dog,int id) throws SQLException;
    //添加
    void add(Dog dog) throws SQLException;

}
