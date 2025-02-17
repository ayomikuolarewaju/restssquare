package com.squareapi.squareapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squareapi.squareapi.model.User;
import com.squareapi.squareapi.repository.UserRepository;

@Service
public class UseService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public Optional<User> getAUser(Long id){
        return userRepository.findById(id);
    }

    public List<User> getUserByFullname(String name){
        return userRepository.findByFullnameContainingIgnoreCase(name);
    }

    public List<User> getUserByEmail(String name){
        return userRepository.findByEmailContainingIgnoreCase(name);
    }

    public Long getCountOfUsers(){
        return userRepository.count();
    }
    
    public User getAUserByFullname(String fullname){
        return userRepository.findByFullname(fullname);
    }

    public User getAUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public User addUser(User user){
        return userRepository.save(user);
    }
}
