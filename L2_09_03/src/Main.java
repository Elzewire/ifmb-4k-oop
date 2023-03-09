import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("login", "1234");
        User u2 = new User("login2", "4321");

        u1.addFriend(u2);

        Post p1 = new Post("It's fine.", u1);
        Post p2 = new Post("Hello, world!", u2);

        Comment c1 = new Comment("It's not.", p1, u1);
        Comment c2 = new Comment("Hello!", p2, u1);

    }
}