package com.example.employyepayrollJdbc;

import java.sql.*;

public class EmployeePayrollDBService {
    private static final String URL = "jdbc:mysql://localhost:3306/payroll_service";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded!");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection Established!");
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL Driver not found!");
        }
        return connection;
    }

    public static void main(String[] args) {
        try {
            Connection connection = getConnection();
            System.out.println("Connected to Database: " + connection.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
