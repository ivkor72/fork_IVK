package jm.task.core.jdbc.util;

import java.sql.*;
import java.sql.SQLException;

public class Util {
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/users";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "IVK_student_kata-71";

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try   {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Class.forName(DB_DRIVER);
            connection.setAutoCommit(false);
        } catch (ClassNotFoundException | SQLException e) {
            connection.setAutoCommit(true);
        }
        return connection;
    }
}
