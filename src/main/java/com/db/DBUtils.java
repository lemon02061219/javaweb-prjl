package com.db;

import java.io.FileReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.ResourceBundle;

public class DBUtils {

    //数据库连接地址
    public static String URL = "jdbc:mysql://localhost/mydb?useSSL=FALSE&serverTimezone=UTC";
    //用户名
    public static String USERNAME = "root";
    //密码
    public static String PASSWORD = "0206";
    //mysql的驱动类
    public static String DRIVER = "com.mysql.cj.jdbc.Driver";

//    private static ResourceBundle rb = ResourceBundle.getBundle("db-config.properties");

    private DBUtils(){}

    //使用静态块加载驱动程序
    static{
//        URL = rb.getString("jdbc.url");
//        USERNAME = rb.getString("jdbc.username");
//        PASSWORD = rb.getString("jdbc.password");
//        DRIVER = rb.getString("jdbc.driver");
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //定义一个获取数据库连接的方法
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("获取连接失败");
        }
        return conn;
    }

    public static void close(ResultSet rs,Statement stat,Connection conn){
        try {
            if(rs!=null)rs.close();
            if(stat!=null)stat.close();
            if(conn!=null)conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

