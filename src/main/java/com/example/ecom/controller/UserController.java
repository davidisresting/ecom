package com.example.ecom.controller;

import com.example.ecom.model.User;
import com.example.ecom.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ResponseEntity<List<User>> getUsers() {
        List<User> dtos = userService.getUsers();
        return new ResponseEntity<List<User>>(dtos, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody @Valid User user) {
        userService.addUser(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }


}
