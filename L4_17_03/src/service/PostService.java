package service;

import model.DAO.impl.list.ListCommentDAO;
import model.DAO.impl.list.ListLikeDAO;
import model.DAO.impl.list.ListPostDAO;
import model.entities.Comment;
import model.entities.Like;
import model.entities.Post;
import model.entities.User;

public class PostService implements Service {

    private ListPostDAO postDAO;
    private ListCommentDAO commentDAO;
    private ListLikeDAO likeDAO;

    public PostService(ListPostDAO postDAO, ListCommentDAO commentDAO, ListLikeDAO likeDAO) {
        this.postDAO = postDAO;
        this.commentDAO = commentDAO;
        this.likeDAO = likeDAO;
    }

    public Post createPost(String text) {
        if (SessionSingleton.getSession().isAuth()) {
            User author = SessionSingleton.getSession().getUser();
            Post p = new Post(text, author);
            author.getPosts().add(p);
            postDAO.save(p);
            return p;
        }
        return null;
    }

    public Comment comment(String text, Post post) {
        if (SessionSingleton.getSession().isAuth()) {
            User user = SessionSingleton.getSession().getUser();
            Comment c = new Comment(text, post, user);
            commentDAO.save(c);
            post.getComments().add(c);
            user.getComments().add(c);
            return c;
        }
        return null;
    }

    public Like like(Post post) {
        if (SessionSingleton.getSession().isAuth()) {
            User user = SessionSingleton.getSession().getUser();
            Like l = new Like(post, user);
            likeDAO.save(l);
            post.getLikes().add(l);
            user.getLikes().add(l);
            return l;
        }
        return null;
    }
}
