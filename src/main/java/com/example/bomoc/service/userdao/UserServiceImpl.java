package com.example.bomoc.service.userdao;

import com.example.bomoc.model.user.User;
import com.example.bomoc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public ResponseEntity<User> getUserById(int id) {
        return null;
    }

    @Override
    public ResponseEntity<User> createUser(User user) {
        return null;
    }

}