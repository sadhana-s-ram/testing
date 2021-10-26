package com.tbp.crud.controller;

import com.tbp.crud.dao.UserRepository;
import com.tbp.crud.entity.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//@RestController
@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;

 @ResponseBody
    @PostMapping("/user")
    public User addUser(@RequestBody User user) {

        return userRepository.saveUser(user);

    }
    @ResponseBody
    @GetMapping("/users")
    public List<User> getUser()  {
        return userRepository.allUsers();
    }

}
