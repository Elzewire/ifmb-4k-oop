package model.DAO;

import model.entities.User;

import java.util.List;

public interface UserDAO {
    List<User> getAll();
    User getByUsername(String username);
    boolean create(User user);
    boolean update(User user);
    boolean delete(User user);
}
