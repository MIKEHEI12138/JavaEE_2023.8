package com.qiu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestfulController {

    @RequestMapping(name = "/add/{a}/{b}",method = RequestMethod.DELETE)
    public String test(@PathVariable int a,@PathVariable int b, Model model){
        int result = a + b;
        model.addAttribute("sum",result);
        return "test";
    }

}
