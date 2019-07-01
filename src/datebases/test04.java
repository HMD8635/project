package datebases;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class test04 {

    @Test
    public void add() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection c= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/day04?characterEncoding=utf-8",
                "root","root");
        PreparedStatement pst = c.prepareStatement("insert into people (p_name,p_id,p_sex,p_add)values(?,?,?,?)");
        pst.setString(1,"张飞");
        pst.setInt(2,11);
        pst.setString(3,"男");
        pst.setString(4,"南京");
        int i= pst.executeUpdate();
        if(i>0)
            System.out.println("OK");
        pst.close();
        c.close();
    }

    @Test
    public void alter ()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost/day04?characterEncoding=utf-8"
                , "root", "root");
        PreparedStatement pst = conn.prepareStatement(" update people set p_name=?,p_id=?,p_sex=?,p_add=? where p_id=?");

        pst.setString(1,"王五");
        pst.setInt(2,10);
        pst.setString(3,"女");
        pst.setString(4,"巴黎");
        pst.setInt(5,10);

        int i = pst.executeUpdate();
        if(i>0)
            System.out.println("OK!");

        pst.close();
        conn.close();

    }
}
