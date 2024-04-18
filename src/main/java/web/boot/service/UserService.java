package web.boot.service;

import org.springframework.stereotype.Service;
import web.boot.model.User;

import java.util.List;


public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
    User getUser(int id);
    List<User> getUsers();
}
