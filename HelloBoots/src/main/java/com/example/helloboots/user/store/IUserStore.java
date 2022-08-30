package com.example.helloboots.user.store;

import com.example.helloboots.user.entity.User;
import com.example.helloboots.user.dto.UserRequestDto;

import java.util.List;

public interface IUserStore {
    String create(User item);
    void update(User item);
    void delete(String id);

    User retrieve(String id);
    List<User> retrieveAll(UserRequestDto userRequestDto);
}
