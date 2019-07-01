package datebases;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class test03 {
    @Test
    public void inquire() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/day04?characterencoding=utf-8",
                "root","root");
        Statement stat=conn.createStatement();
        String sql=" select * from people ";
        ResultSet rs = stat.executeQuery(sql);
        while (rs.next()){
            String name=rs.getString("p_name");
            System.out.println(name);
        }
        rs.close();
        stat.close();
        conn.close();
    }

    @Test
    public void del() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/day04?characterEncoding=utf-8",
                "root","root"
        );
        Statement stat=conn.createStatement();
        String sql=" delete from people where p_name='谭梦潇'";
        int a=stat.executeUpdate(sql);
        if(a>0){
            System.out.println("OK!");
        }else{
            System.out.println("NO!");
        }
        stat.close();
        conn.close();
    }
    @Test
    public void add() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Day04?characterEncoding=utf-8",
        "root","root");
        Statement stat=conn.createStatement();

        String sql=" update people set p_name='大黄',p_id=6,p_sex='女',p_add='美国' where p_name='袁代佳' ";

        //String sql=" insert into people values('大华',9,'男','日本') ";
        int a =stat.executeUpdate(sql);
        if(a>0){
            System.out.println("OK!");
        }else {
            System.out.println("NO!");
        }

    }
}
