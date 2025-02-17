package com.squareapi.squareapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.squareapi.squareapi.model.User;
import com.squareapi.squareapi.service.UseService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UseService useService;

    @GetMapping("/users")
    public List<User> getMethodName() {
        return useService.getAllUser();
    }
    
    @GetMapping("path")
    public Optional<User> getUserById(@RequestParam Long id) {
        return useService.getAUser(id);
    }

    @GetMapping("/user")
    public User getUserByFullname(@PathVariable String param) {
        return useService.getAUserByFullname(param);
    }

    @PostMapping("/user")
    public User postUser(@RequestBody User user){
        return useService.addUser(user);
    }
    
    
}
