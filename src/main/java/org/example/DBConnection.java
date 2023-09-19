package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
    static Connection con;
    public static Connection setConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/google";
            String root = "root";
            String password = "adarsh";
            con = DriverManager.getConnection(url, root, password);
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
