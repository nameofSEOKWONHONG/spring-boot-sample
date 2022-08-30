package com.example.helloboots.user.service;

import com.example.helloboots.user.entity.User;
import com.example.helloboots.user.dto.UserRequestDto;

import java.util.List;

public interface IUserService {
    String register(User user);
    void modify(User user);
    void remove(String id);

    User find(String id);
    List<User> findAll(UserRequestDto userRequestDto);
}
