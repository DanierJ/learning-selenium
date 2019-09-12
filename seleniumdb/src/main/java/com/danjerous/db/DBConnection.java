package com.danjerous.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
          Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectos_jsp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "user123");

          return  connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Unable to connect with Database.");
            e.printStackTrace();
        }

        return null;
    }
}
