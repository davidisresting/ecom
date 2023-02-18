package com.example.ecom.service;

import com.example.ecom.model.User;
import com.example.ecom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    public User addUser(User user) {
        return userRepo.save(user);
    }

    public List<User> getUsers() {
        return userRepo.findAll();
    }
}
