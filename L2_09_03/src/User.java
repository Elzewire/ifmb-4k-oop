import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class User {
    private String login;
    private String pwd;
    private String fio;
    private Date birthdate;

    private List<User> friends;

    public User(String login, String pwd) {
        this.login = login;
        this.pwd = pwd;
        friends = new ArrayList<>();
    }

    public boolean checkLogin(String login, String pwd) {
        return this.login.equals(login) && this.pwd.equals(pwd);
    }

    public void addFriend(User friend) {
        if (!friends.contains(friend)) {
            friends.add(friend);
            friend.addFriend(this);
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }
}
