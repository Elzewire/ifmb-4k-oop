package model.entities;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class User {

    private int id;
    private String login;
    private String pwd;
    private String fio;
    private Date birthdate;

    private List<User> friends;
    private List<Post> posts;
    private List<Comment> comments;
    private List<Like> likes;
    private List<Group> groups;

    public User(String login, String pwd) {
        this.login = login;
        this.pwd = pwd;
        id = 0;
        friends = new ArrayList<>();
        posts = new ArrayList<>();
        comments = new ArrayList<>();
        likes = new ArrayList<>();
        groups = new ArrayList<>();
    }

    public User(int id, String login, String pwd) {
        this.id = id;
        this.login = login;
        this.pwd = pwd;
        friends = new ArrayList<>();
        posts = new ArrayList<>();
        comments = new ArrayList<>();
        likes = new ArrayList<>();
        groups = new ArrayList<>();
    }

    public void notify(String text, Group group) {
        System.out.println(login + ": notification from group " + group.getName() + text);
    }

    public boolean checkPwd(String pwd) {
        return this.pwd.equals(pwd);
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

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public String getPwd() {
        return pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
