package model.entities;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Mapper {

    public static User mapUser(ResultSet rs) {
        try {
            int id = rs.getInt("id");
            String username = rs.getString("username");
            String pwd = rs.getString("pwd");

            String fio = rs.getString("fio");
            Date birthdate = rs.getDate("birthdate");

            User user = new User(id, username, pwd);
            user.setFio(fio);
            user.setBirthdate(birthdate);

            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<User> mapUsers(ResultSet rs) throws SQLException {
        List<User> users = new ArrayList<>();
        while (rs.next()) {
            users.add(Mapper.mapUser(rs));
        }
        return users;
    }

}
