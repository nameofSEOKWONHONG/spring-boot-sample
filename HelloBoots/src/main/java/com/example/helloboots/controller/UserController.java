package com.example.helloboots.controller;

import com.example.helloboots.entity.User;
import com.example.helloboots.service.IUserService;
import com.example.helloboots.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getUser(String id) { return this.userService.find(id);}

    @GetMapping("/users")
    public List<User> getUsers(UserVO userVO) { return this.userService.findAll(userVO); }

    @PostMapping("/register")
    public String register(User user) {
        return this.userService.register(user);
    }

    @DeleteMapping("/remove")
    public void remove(String id) {
        this.userService.remove(id);
    }

    @PutMapping("/modify")
    public void modify(User user) {
        this.userService.modify(user);
    }
}
