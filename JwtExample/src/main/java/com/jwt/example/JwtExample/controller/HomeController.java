package com.jwt.example.JwtExample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    //http://localhost:8081/home/user
    @GetMapping("/user")
    public String getUser(){
        System.out.println("getting users");
        return "Users";
    }
}
