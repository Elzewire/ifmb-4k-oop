package model.DAO.impl.db;

import model.DAO.DBConnectionSingleton;
import model.DAO.UserDAO;
import model.entities.Mapper;
import model.entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class DBUserDao implements UserDAO {

    @Override
    public List<User> getAll() {
        Connection conn = DBConnectionSingleton.getConn();
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM \"users\";"
            );
            ResultSet rs = ps.executeQuery();
            return Mapper.mapUsers(rs);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public User getByUsername(String username) {
        Connection conn = DBConnectionSingleton.getConn();
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM \"users\" WHERE username = ?;"
            );
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return Mapper.mapUser(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User getByID(int id) {
        Connection conn = DBConnectionSingleton.getConn();
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM \"users\" WHERE id = ?;"
            );
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return Mapper.mapUser(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean create(User user) {
        Connection conn = DBConnectionSingleton.getConn();
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO \"users\" (username, pwd, fio, birthdate) VALUES (?, ?, ?, ?);"
            );
            ps.setString(1, user.getLogin());
            ps.setString(2, user.getPwd());
            ps.setString(3, user.getFio());
            ps.setDate(4, user.getBirthdate());
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(User user) {
        Connection conn = DBConnectionSingleton.getConn();
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "UPDATE \"users\" SET username = ?, pwd = ?, fio = ?, birthdate = ? WHERE id = ?;"
            );
            ps.setString(1, user.getLogin());
            ps.setString(2, user.getPwd());
            ps.setString(3, user.getFio());
            ps.setDate(4, user.getBirthdate());
            ps.setInt(5, user.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(User user) {
        Connection conn = DBConnectionSingleton.getConn();
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "DELETE FROM \"users\" WHERE id = ?;"
            );
            ps.setInt(1, user.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
