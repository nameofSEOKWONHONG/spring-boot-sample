package com.example.helloboots.user.store.impl;

import com.example.helloboots.user.entity.User;
import com.example.helloboots.user.store.IUserStore;
import com.example.helloboots.user.dto.UserRequestDto;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Repository
public class UserStore implements IUserStore {
    private final Map<String, User> userMap;

    public UserStore() {
        userMap = new HashMap<>();
        init();
    }

    private void init() {
        if(userMap.isEmpty()) {
            var user1 = new User("test1", "test1@test.com", "", "");
            var user2 = new User("test2", "test2@test.com", "", "");
            var user3 = new User("test3", "test3@test.com", "", "");
            userMap.put(user1.getId(), user1);
            userMap.put(user2.getId(), user2);
            userMap.put(user3.getId(), user3);
        }
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
    public List<User> retrieveAll(UserRequestDto userRequestDto) {
        Predicate<User> nameFilter = (user) -> user.getName().equals(userRequestDto.getName());
        Predicate<User> emailFilter = (user) -> user.getEmail().equals(userRequestDto.getEmail());
        var result = new HashSet<User>();
        if(!"".equals(userRequestDto.getName())) result.addAll(this.userMap.values().stream().filter(nameFilter).collect(Collectors.toList()));
        if(!"".equals(userRequestDto.getEmail())) result.addAll(this.userMap.values().stream().filter(emailFilter).collect(Collectors.toList()));
        return result.stream().toList();
    }
}
