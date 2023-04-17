package model.DAO;

import model.entities.Post;
import model.entities.User;

import java.util.List;

public interface PostDAO {
    List<Post> getAll();
    List<Post> getByAuthor(User author);
    Post getByID(int id);
    boolean create(Post post);
    boolean update(Post post);
    boolean delete(Post post);
}
