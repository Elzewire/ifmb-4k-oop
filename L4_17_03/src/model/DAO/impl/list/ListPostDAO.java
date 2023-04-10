package model.DAO.impl.list;

import model.entities.Post;
import model.entities.User;

import java.util.ArrayList;
import java.util.List;

public class ListPostDAO {

    private List<Post> posts;

    public ListPostDAO(List<Post> posts) {
        this.posts = posts;
    }

    public List<Post> getAll() {
        return posts;
    }

    public List<Post> getAllByAuthor(User author) {
        List<Post> q = new ArrayList<>();

        for (Post p : posts) {
            if (p.getAuthor() == author) {
                q.add(p);
            }
        }

        return q;
    }

    public boolean save(Post post) {
        posts.add(post);
        return true;
    }
}
