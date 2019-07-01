package com.kgc.u2.JDBC.connector;

import com.kgc.u2.JDBC.code.People;
import java.sql.SQLException;
import java.util.List;

public interface Userimpl {
    List<People> query() throws SQLException;
    void update(People people,int a) throws SQLException;
    void delete(int a) throws SQLException;
    void add(People people) throws SQLException;
}
