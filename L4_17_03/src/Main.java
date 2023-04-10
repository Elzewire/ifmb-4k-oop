import model.DAO.*;
import model.DAO.impl.db.DBUserDao;
import model.DAO.impl.list.ListCommentDAO;
import model.DAO.impl.file.FileUserDAO;
import model.DAO.impl.list.ListLikeDAO;
import model.DAO.impl.list.ListPostDAO;
import service.PostService;
import service.UserService;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create DAO
        //UserDAO userDAO = new FileUserDAO("src/resources/users.txt");
        UserDAO userDAO = new DBUserDao();
        //ListPostDAO postDAO = new ListPostDAO(new ArrayList<>());
        //ListCommentDAO commentDAO = new ListCommentDAO(new ArrayList<>());
        //ListLikeDAO likeDAO = new ListLikeDAO(new ArrayList<>());

        // Create services
        UserService userService = new UserService(userDAO);
        //PostService postService = new PostService(postDAO, commentDAO, likeDAO);

        Scanner sc = new Scanner(System.in);

        String login = sc.nextLine();
        String pwd = sc.nextLine();

        System.out.println(userService.auth(login, pwd));
        //System.out.println(userService.register(login, pwd));
    }
}