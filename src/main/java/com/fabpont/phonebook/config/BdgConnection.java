package com.fabpont.phonebook.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BdgConnection {

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/phonebook"; // seu banco
        String user = "root";
        String password = "1234";

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }
}
