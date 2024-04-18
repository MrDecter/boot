package web.boot.dao;

import org.springframework.stereotype.Repository;
import web.boot.model.User;

import java.util.List;


public interface UserDAO {

    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
    User getUser(int id);
    List<User> getUsers();
}
