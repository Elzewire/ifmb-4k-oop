package model.DAO.impl.file;

import model.DAO.UserDAO;
import model.entities.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUserDAO implements UserDAO {

    private List<User> users;
    private String path;

    public FileUserDAO(String path) {
        this.path = path;

        try {
            Scanner sc = new Scanner(new File(path));
            users = new ArrayList<>();

            while (sc.hasNextLine()) {
                String [] line = sc.nextLine().split(";");
                users.add(new User(line[0], line[1]));
            }

            sc.close();
        } catch (FileNotFoundException e) {
            users = new ArrayList<>();
        }
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public User getByUsername(String username) {
        for (User u : users) {
            if (u.getLogin().equals(username)) {
                return u;
            }
        }
        return null;
    }

    @Override
    public boolean create(User user) {
        try {
            FileWriter fw = new FileWriter(path);
            for (User u : users) {
                fw.write(u.getLogin() + ";" + u.getPwd() + "\n");
            }

            fw.write(user.getLogin() + ";" + user.getPwd() + "\n");
            fw.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean delete(User user) {
        return false;
    }
}
