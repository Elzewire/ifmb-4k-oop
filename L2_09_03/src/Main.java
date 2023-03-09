import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("login", "1234");
        User u2 = new User("login2", "4321");

        /*
        Scanner sc = new Scanner(System.in);
        String login = sc.nextLine();
        String pwd = sc.nextLine();

        System.out.println(u1.checkLogin(login, pwd));
        */

        u1.addFriend(u2);
        //u2.addFriend(u1);

        System.out.println(u1.getFriends());
        System.out.println(u2.getFriends());
    }
}