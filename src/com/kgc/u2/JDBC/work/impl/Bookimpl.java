package com.kgc.u2.JDBC.work.impl;

import com.kgc.u2.JDBC.work.Book;

import java.sql.SQLException;
import java.util.List;

public interface Bookimpl {
    List<Book> query() throws SQLException;
    void update(Book book,int id) throws SQLException;
    void delete(int id) throws SQLException;
    void add(Book book) throws SQLException;

}
