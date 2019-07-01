package datebases;

import java.sql.*;

public class test01 {
    public static void main(String[] args)  {
        //加载驱动
        Connection conn=null;
        Statement stat=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //创建数据库连接对象
            conn= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/day03?characterEncoding=utf-8",
                    "root","root");
            //创建操作数据库对象
            stat=conn.createStatement();
            //编写sql语句
            String sql="  select * from emp  ";
            //执行sql语句，返回结果集
            rs=stat.executeQuery(sql);
            //操作结果集
            while (rs.next()){
                int no=rs.getInt("empno");
                String name=rs.getString("ename");
                String job=rs.getString("job");
                System.out.println(no+"--"+name+"--"+job);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        //释放资源
        try {
            if(rs!=null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if(stat!=null)
              stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if(conn!=null)
                conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
