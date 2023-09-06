package com.qiu.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int userID;
    private String nickname;
    private String gender;
    private String grade;
    private String studentID;
    private String password;
    private String phone;
    private String email;
    

}
