package com.qiu.dao;

import com.qiu.entity.User;

import java.util.List;

public interface UserMapper {
    User getUserByID(int userID);
    int insertUser(User user);
    List<User> getUserList(); // 添加这个方法
    // 其他方法...
}
