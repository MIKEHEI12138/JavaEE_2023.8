package com.qiu.entity;

public class Admin {
    private int adminID;
    private String username;
    private String password;

    // 添加构造方法、getters和setters

    @Override
    public String toString() {
        return "Admin{" +
                "adminID=" + adminID +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
