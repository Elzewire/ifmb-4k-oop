package model.DAO.impl.db;

import model.DAO.DBConnectionSingleton;
import model.DAO.UserDAO;
import model.entities.Mapper;
import model.entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DBUserDao implements UserDAO {

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getByUsername(String username) {
        Connection conn = DBConnectionSingleton.getConn();
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM users WHERE username = ?;"
            );
            ps.setString(1, username);
            return Mapper.mapUser(ps.executeQuery());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean create(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean delete(User user) {
        return false;
    }
}
