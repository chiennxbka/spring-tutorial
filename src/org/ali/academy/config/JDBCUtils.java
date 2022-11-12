package org.ali.academy.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtils {

    public static Connection getConnection(String driverClass, String dbURL, String userName, String password) {
        Connection conn = null;
        try {
            Class.forName(driverClass);
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}
