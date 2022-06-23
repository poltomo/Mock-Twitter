package com.poltomo.HibernateDemo.controllers;

import com.poltomo.HibernateDemo.models.Post;
import com.poltomo.HibernateDemo.models.User;
import com.poltomo.HibernateDemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public Optional<User> getUserById(@PathVariable Integer id) {
        return userService.findById(id);
    }

    @GetMapping("/users/{id}/posts")
    public List<Post> getPostsByUser(@PathVariable Integer id) {
        Optional<User> user = userService.findById(id);
        if (user.isPresent()){
            return user.get().getPosts();
        }
        return null;
    }

    //JPARepository
    @GetMapping("/users/location/{id}/users")
    public List<User> getUsersByLocation(@PathVariable Integer id) {
        return userService.getUsersByLocation(id);
    }

    @PostMapping("/users/add")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @PutMapping("/users/{id}/update")
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

    @DeleteMapping("/users/{id}/delete")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }
}
