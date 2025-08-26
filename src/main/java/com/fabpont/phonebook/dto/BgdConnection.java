package com.fabpont.phonebook.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BgdConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/phonebook";
        String user = "root";
        String password = "1234";

        try{
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database successfully");
        }
        catch(SQLException e){
            System.out.println("Error connecting to database" + e.getMessage());
        }
    }
}
