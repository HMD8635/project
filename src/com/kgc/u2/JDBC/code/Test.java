package com.kgc.u2.JDBC.code;

import com.kgc.u2.JDBC.connector.Userimpl;

import java.sql.SQLException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws SQLException {
        /*String sql =" select * from people ";
        JDBCutil.executeQuery(sql);
        *//*String sql=" insert into people (pname,pid,psex,padd) values(?,?,?,?) ";
        JDBCutil.executeUpdate(sql,"何润东",1,"男","加拿大");*//*
        *//*testinpl t=new testinpl();
        t.chaxun();*/

        Userimpl peopleDao=new PeopleDao();
        //People people=new People("雷姆",16,"女","异世界");
        /*peopleDao.add(people);*/
        //peopleDao.delete(15);
        List<People> peopleList = peopleDao.query();

        System.out.println(peopleList);
        //peopleDao.add(people);

    }
}
