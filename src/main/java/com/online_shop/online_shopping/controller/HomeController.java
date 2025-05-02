package com.online_shop.online_shopping.controller;


import com.online_shop.online_shopping.model.UserDetails;
import com.online_shop.online_shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {


    @Autowired
    private UserService userService;
    @GetMapping("home")
    public String home(){
        System.out.println("in the controller");
        return "welcome to spring world!!";
    }

    @GetMapping("users")
    public List<UserDetails> getAllUsers(){
        System.out.println("get allusers called");
        return userService.userList();
    }
}
