import java.util.Base64;

public class User {
    private String login;
    private String pwd;

    public User(String login, String pwd) {
        this.login = login;
        this.pwd = pwd;
        //this.pwd = Base64.getEncoder().encodeToString(pwd.getBytes());
    }

    public boolean checkLogin(String login, String pwd) {
        return this.login.equals(login) && this.pwd.equals(pwd);
                //this.pwd.equals(Base64.getEncoder().encodeToString(pwd.getBytes()));
    }
}
