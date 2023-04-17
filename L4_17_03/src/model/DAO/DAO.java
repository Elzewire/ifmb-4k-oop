package model.DAO;

import model.entities.Post;
import model.entities.User;

import java.util.List;

public class DAO<T>{
    List<T> getAll() {
        return null;
    };
    T getByID(int id) {
        return null;
    };
    boolean create(T entity) {
        return false;
    };
    boolean update(T entity) {
        return false;
    };
    boolean delete(T entity) {
        return false;
    };
}
