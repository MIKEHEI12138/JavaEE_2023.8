package com.qiu.dao;

import com.qiu.pojo.User;

import java.util.List;

public interface UserMapper {

    //实现增删改查
    User getUserById(int userID);

    void insertUser(User user);

    void updateUser(User user);

    void deleteUser(int userID);

    List<User> getAllUsers();
}
