package com.springsecurity.springsecuritylearn.controller;

import com.springsecurity.springsecuritylearn.model.User;
import com.springsecurity.springsecuritylearn.service.UserService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User>  getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String userName){
        return userService.getUser(userName);
    }

    @PostMapping("/")
    public User add(@RequestBody User user){
        return userService.addUser(user);
    }
}
