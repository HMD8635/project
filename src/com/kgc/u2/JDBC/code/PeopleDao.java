package com.kgc.u2.JDBC.code;

import com.kgc.u2.JDBC.connector.Userimpl;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import java.sql.SQLException;
import java.util.List;

public class PeopleDao implements Userimpl {

    private QueryRunner qr=new QueryRunner(new ComboPooledDataSource());
    //查询全部
    @Override
    public List<People> query() throws SQLException {
        String sql= " select * from people ";
        List<People> peopleList = qr.query(sql, new BeanListHandler<People>(People.class));
        return peopleList;
    }
    //修改
    @Override
    public void update(People people,int a) throws SQLException {
        String sql=" update people set pname=?,pid=?,psex=?,padd=? where pid=? ";
        qr.update(sql,people.getPname(),people.getPid(),people.getPsex(),people.getPadd(),a);
    }
    //删除
    @Override
    public void delete(int a) throws SQLException {
        String sql=" delete from people where pid=? ";
        qr.execute(sql,a);
    }
    //添加
    @Override
    public void add(People people) throws SQLException {
        String sql =" insert into people(pname,pid,psex,padd) values(?,?,?,?) ";
        qr.insert(sql,new BeanHandler<People>(People.class)
        ,people.getPname(),people.getPid(),people.getPsex(),people.getPadd());
    }
}
