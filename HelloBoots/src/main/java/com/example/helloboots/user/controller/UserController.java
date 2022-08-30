package com.example.helloboots.user.controller;

import com.example.helloboots.user.entity.User;
import com.example.helloboots.user.service.IUserService;
import com.example.helloboots.user.dto.UserRequestDto;
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
    public List<User> getUsers(UserRequestDto userRequestDto) { return this.userService.findAll(userRequestDto); }

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
