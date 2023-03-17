package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private String text;
    private User author;
    private List<Like> likes;
    private List<Comment> comments;


    public Post(String text, User author) {
        this.text = text;
        this.author = author;
        likes = new ArrayList<>();
        comments = new ArrayList<>();
    }

    public int likes() {
        return likes.size();
    }

    @Override
    public String toString() {
        return text + " - " + author + "(" + likes.size() + " likes)";
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
