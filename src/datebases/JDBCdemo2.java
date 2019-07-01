package datebases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCdemo2 {
    public static void main(String[] args)  throws Exception{

        //JDBC操作数据库
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/day04?characterEncoding=utf-8",
                "root","root");
        Statement stat=conn.createStatement();
        String sql=" select * from people ";

        ResultSet rs=stat.executeQuery(sql);
        while (rs.next()){
            int no=rs.getInt("id");
            String name=rs.getString("name");
            String sex=rs.getString("sex");
            String add=rs.getString("add");
            System.out.println(no+"--"+name+"--"+sex+"--"+add);
        }
        rs.close();
        stat.close();
        conn.close();
    }
}
