package datebases;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class test02 {
    @Test
    public void add() throws Exception{
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //创建数据库对象
        Connection conn= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/day04?characterEncoding=utf-8",
                "root","root");
        //创建数据库操作对象
        Statement stat=conn.createStatement();
        //编写sql语句
        String sql=" insert into people values('刘英浩','5','男','北京') ";
        //执行Sql语句
        int rs = stat.executeUpdate(sql);
        if(rs>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
        stat.close();
        conn.close();
    }
    @Test
    public void del() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/day04?characterEncoding=utf-8",
                "root","root");
        Statement stat=conn.createStatement();
        String sql=" delete from people where p_id='5'";
        int a=stat.executeUpdate(sql);
        if(a>0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
        stat.close();
        conn.close();
    }
    @Test
    public void alter() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/day04?characterEncoding=utf-8",
                "root","root");
        Statement stat=conn.createStatement();
        String sql=" update people set p_name='袁代佳',p_id=4,p_sex='女',p_add='上海' where p_id=3";
        int a=stat.executeUpdate(sql);
        if(a>0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
        stat.close();
        conn.close();
    }
}
