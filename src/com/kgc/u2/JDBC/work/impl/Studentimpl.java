package com.kgc.u2.JDBC.work.impl;

import com.kgc.u2.JDBC.work.Student;

import java.sql.SQLException;
import java.util.List;

public interface Studentimpl {
    List<Student> query() throws SQLException;
    void add(Student student) throws SQLException;
    void delete(int id) throws SQLException;
    void update(Student student,int id) throws SQLException;
}
