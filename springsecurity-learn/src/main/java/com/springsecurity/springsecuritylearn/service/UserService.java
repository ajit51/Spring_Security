package com.springsecurity.springsecuritylearn.service;


import com.springsecurity.springsecuritylearn.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> users = new ArrayList<>();

    public UserService() {
        this.users.add(new User("abc","abc","abc@gmail.com"));
        this.users.add(new User("xyz","xyz","xyz@gmail.com"));
    }

    //get all users
    public List<User> getAllUsers(){
        return users;
    }

    //get user by username
    public User getUser(String userName){
        return users.stream().filter(user -> user.getUsername().equals(userName)).findAny().orElse(null);
    }

    //add user
    public User addUser(User user){
        users.add(user);
        return user;
    }
}
