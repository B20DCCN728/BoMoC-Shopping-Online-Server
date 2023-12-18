package com.example.bomoc.controller;

import com.example.bomoc.model.user.User;
import com.example.bomoc.service.userdao.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

//    @PostMapping("/addUser")
//    public void addUser(User user) {
//
//    }

}
