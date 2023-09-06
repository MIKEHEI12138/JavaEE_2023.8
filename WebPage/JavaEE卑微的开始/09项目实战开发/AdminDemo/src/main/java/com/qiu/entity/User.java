package com.qiu.entity;

public class User {
    private int userID;
    private String nickname;
    private String gender;
    private String grade;
    private String studentID;
    private String password;
    private String phone;
    private String email;

    // 添加构造方法、getters和setters

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", nickname='" + nickname + '\'' +
                ", gender='" + gender + '\'' +
                ", grade='" + grade + '\'' +
                ", studentID='" + studentID + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public User(int userID, String nickname, String gender, String grade, String studentID, String password, String phone, String email) {
        this.userID = userID;
        this.nickname = nickname;
        this.gender = gender;
        this.grade = grade;
        this.studentID = studentID;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }
}
