import model.entities.Group;
import model.entities.Post;
import model.entities.User;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("user1", "1234");
        User u2 = new User("user2", "4321");

        u1.addFriend(u2);

        Post p1 = u1.createPost("It's fine.");
        Post p2 = u2.createPost("Hello, world!");

        p1.comment("It's not.", u1);
        p2.comment("Hello!", u1);

        p1.like(u1);
        p1.like(u2);

        System.out.println(u1.getPosts());
        System.out.println(u1.getComments());
        System.out.println(u1.getLikes());

        Group g = u1.createGroup("F.R.I.E.N.D.S.");
        g.join(u2);

        System.out.println(g.getUsers());
        System.out.println(u1.getGroups());

        g.notify("Hello everyone!");
    }
}