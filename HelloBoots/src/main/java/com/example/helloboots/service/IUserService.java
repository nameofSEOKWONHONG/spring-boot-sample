package com.example.helloboots.service;

import com.example.helloboots.entity.User;
import com.example.helloboots.vo.UserVO;

import java.util.List;

public interface IUserService {
    String register(User user);
    void modify(User user);
    void remove(String id);

    User find(String id);
    List<User> findAll(UserVO userVO);
}
