package com.najmcodes.UsersApp.controller;

import com.najmcodes.UsersApp.model.User;
import com.najmcodes.UsersApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public User createUser(@RequestBody User user){
        User user1=userService.createUser(user);
        return user1;
    }
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @PutMapping("/update/{id}")
    public User updateUserById(@RequestBody User user,@PathVariable("id") long id){
        return userService.updateUser(user,id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id){
         userService.deleteUser(id);
         return "User deleted successfully";
    }
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") long id){
        return userService.getUserById(id);
    }

}
