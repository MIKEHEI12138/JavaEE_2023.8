package com.qiu.service;

import com.qiu.pojo.User;
import java.util.List;

public interface UserService {
    User getUserById(int userID);
    void insertUser(User user);
    void updateUser(User user);
    void deleteUser(int userID);
    List<User> getAllUsers();
}
