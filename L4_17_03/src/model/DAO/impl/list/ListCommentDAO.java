package model.DAO.impl.list;

import model.entities.Comment;
import model.entities.User;

import java.util.ArrayList;
import java.util.List;

public class ListCommentDAO {
    private List<Comment> comments;

    public ListCommentDAO(List<Comment> comments) {
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
