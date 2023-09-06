package com.qiu.controller;

import com.qiu.pojo.User;
import com.qiu.service.UserService;
import com.qiu.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService = new UserServiceImpl();

    @RequestMapping("/user")
    public String list(Model model) {

        List<User> list = userService.getAllUsers();
        model.addAttribute("list", list);
        return "user";

    }


    @RequestMapping("/toadduser")
    public String toAddUser() {
        return "adduser";
    }

    @RequestMapping("/adduser")
    public String addPaper(User user) {
        user.setUserID(666);
        userService.insertUser(user);
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String Index() {
        return "index";
    }
}