package service;

import model.DAO.UserDAO;
import model.entities.Post;
import model.entities.Session;
import model.entities.User;

public class UserService implements Service {

    private UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    /*    public Group createGroup(String name) {
        Group g = new Group(name);
        g.join(this);
        groups.add(g);
        return g;
    }*/

    public boolean auth(String login, String pwd) {
        User user = userDAO.getByUsername(login);
        if (user != null && user.checkPwd(pwd)) {
            SessionSingleton.getSession().setUser(user);
            return true;
        }
        return false;
    }

    public boolean register(String login, String pwd) {
        if (userDAO.getByUsername(login) == null) {
            return userDAO.create(new User(login, pwd));
        }
        return false;
    }

    public void addFriend(User friend) {
        if (SessionSingleton.getSession().isAuth()) {
            User u = SessionSingleton.getSession().getUser();
            u.getFriends().add(friend);
            friend.getFriends().add(u);
        }
    }
}
