import java.sql.*;

public class DBExample {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:postgresql://localhost:5433/project";
        String username = "postgres";
        String password = "postgres";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            //selectFromDBwithID(conn, 7);
            //deleteFromDB(conn);
            //createInDB(conn, "user3", "4321");
            //createInDB(conn, "user5", "4312");
            updateInDB(conn, 10, "1111");
            selectFromDB(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void updateInDB(Connection conn, int id, String pwd) {
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "UPDATE users SET pwd = ? WHERE id = ?"
            );
            ps.setString(1, pwd);
            ps.setInt(2, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createInDB(Connection conn, String username, String pwd) {
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO users (username, pwd) VALUES (?, ?);"
            );
            ps.setString(1, username);
            ps.setString(2, pwd);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteFromDB(Connection conn) {
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM users WHERE username = ?;");
            ps.setString(1, "user3");
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectFromDB(Connection conn) {
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM users;");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("username"));
                System.out.println(rs.getString("pwd"));
                System.out.println(rs.getString("fio"));
                System.out.println(rs.getDate("birthdate"));
                System.out.println();
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectFromDBwithID(Connection conn, int id) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM users WHERE id = ?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("username"));
                System.out.println(rs.getString("pwd"));
                System.out.println(rs.getString("fio"));
                System.out.println(rs.getDate("birthdate"));
                System.out.println();
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
