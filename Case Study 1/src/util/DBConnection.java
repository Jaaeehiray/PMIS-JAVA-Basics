package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/librarydb";

    private static final String USER = "root";
    private static final String PASSWORD = "#Jaaee1663";

    public static Connection getConnection()
            throws SQLException {

        return DriverManager.getConnection(
                URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try (Connection con = getConnection()) {
            System.out.println(
                    "Database connected successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
