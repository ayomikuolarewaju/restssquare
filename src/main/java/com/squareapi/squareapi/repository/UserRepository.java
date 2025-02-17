package com.squareapi.squareapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.squareapi.squareapi.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findByFullnameContainingIgnoreCase(String name);
    List<User> findByEmailContainingIgnoreCase(String name);

     User findByFullname(String fullname);

     User findByEmail(String email);
     
     
    
}
