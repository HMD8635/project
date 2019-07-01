package com.kgc.u2.JDBC.code;

import com.kgc.u2.JDBC.connector.jdbcimpl;
import com.kgc.u2.JDBC.contcat.JDBCutil;

public class testinpl implements jdbcimpl {
    @Override
    public void chaozuo() {

    }

    @Override
    public void chaxun() {
        String sql=" select * from people ";
       // JDBCutil.executeQuery(sql);
    }
}
