package com.example.bomoc.service.userdao;

import com.example.bomoc.model.user.User;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllUsers();

    Optional<User> getUserById(int id);

    User createUser(User user);
}