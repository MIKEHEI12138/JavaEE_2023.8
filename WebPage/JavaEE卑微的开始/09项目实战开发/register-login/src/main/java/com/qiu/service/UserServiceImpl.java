package com.qiu.service;

import com.qiu.dao.UserMapper;
import com.qiu.pojo.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    //调用dao层的操作，设置一个set接口，方便Spring管理
    private UserMapper UserMapper;

    public void setUserMapper(UserMapper UserMapper) {
        this.UserMapper = UserMapper;
    }

    public void insertUser(User user) {
        UserMapper.insertUser(user);
    }

    public void deleteUser(int id) {
        UserMapper.deleteUser(id);
    }

    public void updateUser(User User) {
        UserMapper.updateUser(User);
    }

    public User getUserById(int id) {
        return UserMapper.getUserById(id);
    }

    public List<User> getAllUsers() {
        return UserMapper.getAllUsers();
    }
}