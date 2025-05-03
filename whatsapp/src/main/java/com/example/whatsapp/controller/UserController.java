package com.example.whatsapp.controller;

import com.example.whatsapp.model.User;
import com.example.whatsapp.model.UserDTO;
import com.example.whatsapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User registerUser(@RequestBody @Validated UserDTO userDTO) {
        return userService.registerUser(userDTO.getName(), userDTO.getPhone());
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable Long userId) {
        return userService.getUser(userId);
    }

    @PutMapping("/login")
    public void loginUser(@RequestParam Long userId) {
        userService.login(userId);
    }

    @PutMapping("/logout")
    public void logoutUser(@RequestParam Long userId) {
        userService.logout(userId);
    }
}
