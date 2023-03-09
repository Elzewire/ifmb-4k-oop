public class Comment {
    private String text;
    private Post post;
    private User author;

    public Comment(String text, Post post, User author) {
        this.text = text;
        this.post = post;
        this.author = author;
    }

    @Override
    public String toString() {
        return author + ": " + text + " @" + post.getText();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
