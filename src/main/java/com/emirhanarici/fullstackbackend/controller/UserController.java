package com.emirhanarici.fullstackbackend.controller;

import com.emirhanarici.fullstackbackend.entities.User;
import com.emirhanarici.fullstackbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User add(@RequestBody User newUser){
        return userService.add(newUser);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PutMapping("/user/{id}")
    public User updateUser(@RequestBody User newUser,@PathVariable Long id){
        return userService.updateUser(newUser,id);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteById(id);
    }



}

