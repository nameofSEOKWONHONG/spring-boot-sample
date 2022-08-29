package com.example.helloboots.store.impl;

import com.example.helloboots.entity.User;
import com.example.helloboots.store.IUserStore;
import com.example.helloboots.vo.UserVO;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Repository
public class UserStore implements IUserStore {
    private final Map<String, User> userMap;

    public UserStore() {
        userMap = new HashMap<>();
    }

    @Override
    public String create(User item) {
        this.userMap.put(item.getId(), item);
        return item.getId();
    }

    @Override
    public void update(User item) {
        this.userMap.put(item.getId(), item);
    }

    @Override
    public void delete(String id) {
        this.userMap.remove(id);
    }

    @Override
    public User retrieve(String id) {
        return this.userMap.get(id);
    }

    @Override
    public List<User> retrieveAll(UserVO userVO) {
        Predicate<User> nameFilter = (user) -> user.getName().equals(userVO.getName());
        Predicate<User> emailFilter = (user) -> user.getEmail().equals(userVO.getEmail());
        var result = new HashSet<User>();
        if(!"".equals(userVO.getName())) result.addAll(this.userMap.values().stream().filter(nameFilter).collect(Collectors.toList()));
        if(!"".equals(userVO.getEmail())) result.addAll(this.userMap.values().stream().filter(emailFilter).collect(Collectors.toList()));
        return result.stream().toList();
    }
}
