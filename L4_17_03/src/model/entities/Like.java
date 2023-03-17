package model.entities;

public class Like {
    private Post post;
    private User author;

    public Like(Post post, User author) {
        this.post = post;
        this.author = author;
    }

    @Override
    public String toString() {
        return author + " liked @" + post.getText();
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
