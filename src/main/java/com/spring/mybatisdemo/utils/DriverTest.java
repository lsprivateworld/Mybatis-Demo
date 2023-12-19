package com.spring.mybatisdemo.utils;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class DriverTest {

    public static void main(String[] args) throws Exception {
        driverTest1();
        testConnection2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = scanner.nextLine();
        System.out.println("请输入密  码：");
        String password_ex = scanner.nextLine();
        getConnection5(name, password_ex);
    }
    public static void driverTest1() throws SQLException {
//        Driver driver = new com.mysql.cj.jdbc.Driver();
//        String url = "jdbc:mysql://localhost:3306/test";
//        Properties info = new Properties();
//        info.setProperty("user", "root");
//        info.setProperty("password", "ls140078");
//        Connection con = driver.connect(url, info);
//        System.out.println(con);
    }

    public static void testConnection2() throws Exception {
        // 1.获取Driver实现类对象：使用反射
        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();

        // 2.提供要连接的数据库
        String url = "jdbc:mysql://localhost:3306/blog";

        // 3.提供连接需要的用户名和密码
        Properties info = new Properties();
        info.setProperty("user", "root");
        info.setProperty("password", "ls140078");

        // 4.获取连接
        Connection conn = driver.connect(url, info);
        System.out.println(conn);

    }

    // 方式三：使用DriverManager替换Driver
    public static void testConnection3() throws Exception {
        // 1.获取Driver实现类的对象
        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();

        // 2.提供另外三个连接的基本信息：
        String url = "jdbc:mysql://localhost:3306/blog";
        String user = "root";
        String password = "ls140078";

        // 注册驱动
        DriverManager.registerDriver(driver);

        // 获取连接
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn);
    }

    //方式五(final版)：将数据库连接需要的4个基本信息声明在配置文件中，通过读取配置文件的方式，获取连接
    /*
     * 此种方式的好处？
     * 1.实现了数据与代码的分离。实现了解耦
     * 2.如果需要修改配置文件信息，可以避免程序重新打包。
     */
    public static void getConnection5(String name, String password_ex) throws Exception{

        //1.读取配置文件中的4个基本信息
        InputStream is = DriverTest.class.getClassLoader().getResourceAsStream("jdbc.properties");

        Properties pros = new Properties();
        pros.load(is);

        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        String url = pros.getProperty("url");
        String driverClass = pros.getProperty("driverClass");

        //2.加载驱动
        Class.forName(driverClass);

        //3.获取连接
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn);

        String sql = "SELECT * FROM users " +
                "WHERE `name` = ? " +
                "AND password = ? ;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, password_ex);


        //3.执行SQL
        ResultSet resultSet = ps.executeQuery();
        ps.executeUpdate();
        if (resultSet.next()) {
            System.out.println("Log on successfully!");
        } else {
            System.out.println("Failed to log on!");
        }
    }
}
