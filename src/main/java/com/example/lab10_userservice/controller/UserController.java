package com.example.lab10_userservice.controller;

import com.example.lab10_userservice.VO.ResponseTemplateVO;
import com.example.lab10_userservice.entity.User;
import com.example.lab10_userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User saveUser(@RequestBody User user){

        return userService.saveUser(user);
    }

    @GetMapping("/users/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){

        return userService.getUserWithDepartment(userId);
    }

    @GetMapping("/users")
    public String hello(){

        return "Hello world";
    }
}
