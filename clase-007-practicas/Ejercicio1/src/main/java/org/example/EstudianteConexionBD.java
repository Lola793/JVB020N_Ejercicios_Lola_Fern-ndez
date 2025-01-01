package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstudianteConexionBD {

    static String url = "jdbc:mysql://127.0.0.1:3306/universidad_db";

    public static Connection connect() {
        try {
            return DriverManager.getConnection(url,"root", "");
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
