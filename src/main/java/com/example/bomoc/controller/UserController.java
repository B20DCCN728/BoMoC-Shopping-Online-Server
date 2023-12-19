package com.example.bomoc.controller;

import com.example.bomoc.model.response.ResponseObject;
import com.example.bomoc.model.user.User;
import com.example.bomoc.service.userdao.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAllUsers")
    public ResponseEntity<ResponseObject> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(
                new ResponseObject(
                    "200",
                    "Get all users successfully",
                    users
                )
        );
    }

    @PostMapping("/createUser")
    public ResponseEntity<ResponseObject> createUser(@RequestBody User user) {
        User newUser = userService.createUser(user);
        return ResponseEntity.ok(
                new ResponseObject(
                        "200",
                        "Create user successfully",
                        newUser
                )
        );
    }

}
