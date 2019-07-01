package com.kgc.u2.JDBC.work.impl;

import com.kgc.u2.JDBC.work.Wares;

import java.sql.SQLException;
import java.util.List;

public interface Waresimpl {
    void add(Wares wares) throws SQLException;
    void delete(int id) throws SQLException;
    void update(Wares wares,int id) throws SQLException;
    List<Wares> query() throws SQLException;
}
