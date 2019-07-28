package com.sadria.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
     public static Connection con = null;
    public static Connection getConnet(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sadriasocity", "root", "1234");
            System.out.println("Connected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    return con;
    }  
}
