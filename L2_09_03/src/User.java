import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class User {
    public String login;
    private String pwd;
    private String fio;
    private Date birthdate;

    private List<User> friends;
    private List<Post> posts;
    private List<Comment> comments;
    private List<Like> likes;

    public User(String login, String pwd) {
        this.login = login;
        this.pwd = pwd;
        friends = new ArrayList<>();
        posts = new ArrayList<>();
        comments = new ArrayList<>();
        likes = new ArrayList<>();
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

    public Post createPost(String text) {
        Post p = new Post(text, this);
        posts.add(p);
        return p;
    }

    @Override
    public String toString() {
        return login;
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

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }
}
