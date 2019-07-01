package com.kgc.u2.JDBC.contcat;


import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCutil {
    //全局static变量,只会在工具类中使用
    //连库四要素
    private static String driverName;
    private static String url;
    private static String user;
    private static String password;

    /*
     * 执行一次的代码,static静态代码块
     **/
    static {
        //加载properties配置文件
        //ResourBundle将所有的配置文件当成java类解析.
        //ResourceBundle 在当前目录下

       /*
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        driverName = bundle.getString("driverName");
        url = bundle.getString("url");
        user = bundle.getString("user");
        password = bundle.getString("password");*/


        try {
            //创建Properties对象
            Properties prop = new Properties();
            //创建输入流对象，指向配置文件
            prop.load(new FileReader("config/db.properties"));
            //获取文件中的数据
            driverName = prop.getProperty("driverName");
            url = prop.getProperty("url");
            user = prop.getProperty("user");
            password = prop.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //加载驱动
    static {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            //检查异常封装为一个运行时异常,throw一旦抛出异常,后续代码将不会执行
            throw new RuntimeException(e);
        }
    }

    /*获取数据库连接*/
    private static Connection getConnection() {
        try {
            //创建连接对象
            return DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    /*
     * 释放数据库JDBC资源
     *@parom connection
     * */
    //释放资源
    private static void release(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

/*
    //释放资源
    private static void release(Statement stat, Connection conn) {
        if (stat != null) {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //释放资源
    private static void release(ResultSet rs, Statement stat, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stat != null) {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
*/

    //设置参数Properties
    private static void setProperties(PreparedStatement pst, Object... args) {
        if (pst == null) return;
        if (args == null) return;
        try {
            for (int i = 0; i < args.length; i++) {
                pst.setObject(i + 1, args[i]);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //执行改动操作
    public static void executeUpdate( String sql, Object... args) {
        Connection conn = getConnection();
        if (conn == null) return;
        // 创建预编译对象，同时编写sql语句
        PreparedStatement pst = null;
        try {
            pst = conn.prepareStatement(sql);
            //设置参数
            setProperties(pst, args);
            // 执行sql语句
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            release(conn);
        }
    }

    //执行查询操作
}
