import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<User> users;

    public Group(String name) {
        this.name = name;
        users = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void join(User user) {
        users.add(user);
    }

    public void notify(String text) {
        for (int i = 0; i < users.size(); i++) {
            users.get(i).notify(text, this);
        }
    }
}
