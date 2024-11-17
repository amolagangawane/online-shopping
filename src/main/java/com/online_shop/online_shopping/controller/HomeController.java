package com.online_shop.online_shopping.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("home")
    public String home(){
        System.out.println("in the controller");
        return "welcome to spring world!!";
    }
}
