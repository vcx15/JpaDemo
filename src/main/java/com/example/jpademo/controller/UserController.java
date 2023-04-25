package com.example.jpademo.controller;

import com.example.jpademo.entity.User;
import com.example.jpademo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<User> findUserById(@PathVariable(name = "userId") Long userId) {
        try {
            return ResponseEntity.ok(userService.findUserById(userId));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(null);
        }
    }
}
