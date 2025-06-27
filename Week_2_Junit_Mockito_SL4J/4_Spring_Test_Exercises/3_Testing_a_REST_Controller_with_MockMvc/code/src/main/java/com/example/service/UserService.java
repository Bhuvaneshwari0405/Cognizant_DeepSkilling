package com.example.service;

import com.example.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUserById(Long id) {
        // Dummy logic for now
        User user = new User();
        user.setId(id);
        user.setName("Default");
        return user;
    }
}
