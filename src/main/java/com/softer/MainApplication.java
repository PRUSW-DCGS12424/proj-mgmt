package com.softer;

import com.softer.config.DatabaseConnection;

public class MainApplication {
    static void main() {
        System.out.println("Hola Mundo");
        // Initial connection check
        if (!DatabaseConnection.testConnection()) {
            System.out.println("Warning: Could not connect to MySQL database.\nPlease check if MySQL is running and the credentials in application.properties are correct.");
        } else {
            System.out.println("Database has been connected successfully.");
        }
    }
}
