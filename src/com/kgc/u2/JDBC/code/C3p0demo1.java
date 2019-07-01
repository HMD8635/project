package com.kgc.u2.JDBC.code;

import  com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C3p0demo1 {

    //原始写法
    @Test
    public void queryPeopleAll() throws PropertyVetoException, SQLException {
        //数据源
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        //数据源4要素
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/Day04?characterEncoding=utf-8");
        dataSource.setUser("root");
        dataSource.setPassword("root");

        //创建连接
        Connection conn = dataSource.getConnection();
        PreparedStatement pst = conn.prepareStatement(" select * from people ");
        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString("pname"));

        }
    }
}
