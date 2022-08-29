package com.example.helloboots.store;

import com.example.helloboots.entity.User;
import com.example.helloboots.vo.UserVO;

import java.util.List;

public interface IUserStore {
    String create(User item);
    void update(User item);
    void delete(String id);

    User retrieve(String id);
    List<User> retrieveAll(UserVO userVO);
}
