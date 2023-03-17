package model.DAO;

import model.entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private List<User> users;

    public UserDAO(List<User> users) {
        this.users = users;
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getByUsername(String username) {
        for (User u : users) {
            if (u.getLogin().equals(username)) {
                return u;
            }
        }
        return null;
    }
}
