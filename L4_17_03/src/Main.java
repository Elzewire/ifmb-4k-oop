import model.DAO.*;
import model.entities.User;
import service.PostService;
import service.SessionSingleton;
import service.UserService;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create DAO
        UserDAO userDAO = new FileUserDAO("src/resources/users.txt");
        PostDAO postDAO = new PostDAO(new ArrayList<>());
        CommentDAO commentDAO = new CommentDAO(new ArrayList<>());
        LikeDAO likeDAO = new LikeDAO(new ArrayList<>());

        // Create services
        UserService userService = new UserService(userDAO);
        PostService postService = new PostService(postDAO, commentDAO, likeDAO);

        Scanner sc = new Scanner(System.in);

        String login = sc.nextLine();
        String pwd = sc.nextLine();

        System.out.println(userService.register(login, pwd));
        //System.out.println(userService.auth(login, pwd));
    }
}