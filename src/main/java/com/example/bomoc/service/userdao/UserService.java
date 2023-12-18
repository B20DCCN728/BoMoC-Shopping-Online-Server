package com.example.bomoc.service.userdao;

import com.example.bomoc.model.user.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    ResponseEntity<User> getUserById(int id);

    ResponseEntity<User> createUser(User user);

}