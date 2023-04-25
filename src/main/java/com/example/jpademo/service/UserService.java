package com.example.jpademo.service;

import com.example.jpademo.entity.User;

public interface UserService {
    User findUserById(Long id);
}
