package model.DAO;

import model.entities.Comment;
import model.entities.Post;
import model.entities.User;

import java.util.ArrayList;
import java.util.List;

public class CommentDAO {
    private List<Comment> comments;

    public CommentDAO(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Comment> getAll() {
        return comments;
    }

    public List<Comment> getAllByAuthor(User author) {
        List<Comment> q = new ArrayList<>();

        for (Comment c : comments) {
            if (c.getAuthor() == author) {
                q.add(c);
            }
        }

        return q;
    }

    public boolean save(Comment comment) {
        comments.add(comment);
        return true;
    }
}
