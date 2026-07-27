package com.example.registration.Controller;

import com.example.registration.Entity.User;
import com.example.registration.Service.UserService;

import java.util.Optional;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @GetMapping("/user")
    public Optional<User> getMethodName(@RequestParam String email) {
        return userService.getUserByMail(email);
    }
    
}