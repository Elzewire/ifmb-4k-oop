package model.DAO;

import model.entities.Comment;
import model.entities.Like;
import model.entities.User;

import java.util.ArrayList;
import java.util.List;

public class LikeDAO {
    private List<Like> likes;

    public LikeDAO(List<Like> likes) {
        this.likes = likes;
    }

    public List<Like> getAll() {
        return likes;
    }

    public List<Like> getAllByAuthor(User author) {
        List<Like> q = new ArrayList<>();

        for (Like c : likes) {
            if (c.getAuthor() == author) {
                q.add(c);
            }
        }

        return q;
    }

    public boolean save(Like like) {
        likes.add(like);
        return true;
    }
}
