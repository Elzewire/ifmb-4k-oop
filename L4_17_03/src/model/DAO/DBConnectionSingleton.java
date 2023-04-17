package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionSingleton {
    static Connection conn;
    static String url = "jdbc:postgresql://localhost:5432/project";
    static String username = "postgres";
    static String password = "postgres";

    public static Connection getConn() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
}
