package com.springsecurity.springsecuritylearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class Homecontroller {

    @GetMapping("/home")
    public String home(){
        return "This is homepage";
    }

    @GetMapping("/login")
    public String login(){
        return "This is login page";
    }

    @GetMapping("/register")
    public String register(){
        return "This is register page";
    }
}
