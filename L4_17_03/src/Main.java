import model.DAO.*;
import model.DAO.impl.db.DBUserDao;
import model.DAO.impl.list.ListCommentDAO;
import model.DAO.impl.file.FileUserDAO;
import model.DAO.impl.list.ListLikeDAO;
import model.DAO.impl.list.ListPostDAO;
import model.entities.Comment;
import model.entities.Post;
import model.entities.User;
import service.PostService;
import service.UserService;

import javax.swing.*;
import java.sql.Date;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        User u = new User("123", "123");
        System.out.println();
    }
}