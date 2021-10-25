package com.example.Lab4.passive.model.persistant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {


    private static final String URL = "jdbc:mysql://localhost:3306/khomyn_db?allowPublicKeyRetrieval=true&" +
            "createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "xxxx";

    private static Connection connection = null;

    private ConnectionManager() {
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException e) {
                System.out.println("SQLException: " + e.getMessage());
            }
        }
        return connection;
    }
}