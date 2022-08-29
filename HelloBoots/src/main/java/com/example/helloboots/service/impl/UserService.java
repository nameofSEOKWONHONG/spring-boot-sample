package com.example.helloboots.service.impl;

import com.example.helloboots.entity.User;
import com.example.helloboots.service.IUserService;
import com.example.helloboots.store.IUserStore;
import com.example.helloboots.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService
{
    @Autowired
    private final IUserStore userStore;

    @Override
    public String register(User user) {
        return this.userStore.create(user);
    }

    @Override
    public void modify(User user) {
        this.userStore.update(user);
    }

    @Override
    public void remove(String id) {
        this.userStore.delete(id);
    }

    @Override
    public User find(String id) {
        return this.userStore.retrieve(id);
    }

    @Override
    public List<User> findAll(UserVO userVO) {
        return this.userStore.retrieveAll(userVO);
    }
}
