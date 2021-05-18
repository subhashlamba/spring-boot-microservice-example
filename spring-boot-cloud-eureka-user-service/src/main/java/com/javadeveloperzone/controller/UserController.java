package com.javadeveloperzone.controller;

import com.javadeveloperzone.modal.UserDetails;
import com.javadeveloperzone.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.javadeveloperzone.modal.User;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;


    @GetMapping("/{id}")
    public UserDetails getUser(@PathVariable Long id) {
        log.info("called getUser of UserController");
        return userService.getUserById(id);
    }

    @GetMapping("/get-all-users")
    public List<UserDetails> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }
}
