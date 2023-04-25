package com.example.jpademo.service.impl;

import com.example.jpademo.entity.User;
import com.example.jpademo.repository.UserRepository;
import com.example.jpademo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
