package model.entities;

import model.entities.User;

public class Session {

    private User user;

    public boolean isAuth() {
        return user != null;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
