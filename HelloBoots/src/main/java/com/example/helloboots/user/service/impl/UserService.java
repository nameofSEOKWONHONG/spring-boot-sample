package com.example.helloboots.user.service.impl;

import com.example.helloboots.user.entity.User;
import com.example.helloboots.user.service.IUserService;
import com.example.helloboots.user.store.IUserStore;
import com.example.helloboots.user.dto.UserRequestDto;
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
    public List<User> findAll(UserRequestDto userRequestDto) {
        return this.userStore.retrieveAll(userRequestDto);
    }
}
