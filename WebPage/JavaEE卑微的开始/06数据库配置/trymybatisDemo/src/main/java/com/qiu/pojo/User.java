package com.qiu.pojo;


public class User {
    private int userID;
    private String nickname;
    private String gender;
    private String grade;
    private String studentID;
    private String password;
    private String phone;
    private String email;

    // 构造方法
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

    // Getter方法
    public int getUserID() {
        return userID;
    }

    public String getNickname() {
        return nickname;
    }

    public String getGender() {
        return gender;
    }

    public String getGrade() {
        return grade;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    // Setter方法
    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString方法
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
}
