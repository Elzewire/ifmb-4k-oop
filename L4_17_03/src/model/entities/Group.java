package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Group {

/*    private static long IDCount = 0;

    private static long getIDCount() {
        return IDCount++;
    }*/

    private String name;
    private List<User> users;
    private long ID;

    public Group(String name) {
        this.name = name;
        //this.ID = getIDCount();
        users = new ArrayList<>();
    }

/*    public Group(String name, long ID) {
        this.name = name;
        this.ID = ID;
        users = new ArrayList<>();
    }*/

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

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
}
