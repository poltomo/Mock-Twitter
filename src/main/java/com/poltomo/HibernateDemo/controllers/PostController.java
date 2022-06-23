package com.poltomo.HibernateDemo.controllers;

import com.poltomo.HibernateDemo.models.Post;
import com.poltomo.HibernateDemo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return postService.findAll();
    }

    @GetMapping("/posts/{id}")
    public Optional<Post> getPostById(@PathVariable Integer id) {
        return postService.findById(id);
    }
    
    //JPARepository
    @GetMapping("/posts/users/{id}/posts")
    public List<Post> getPostsByUser(@PathVariable Integer id){
        return postService.getPostsByUser(id);
    }

    @PostMapping("/posts/add")
    public String addPost(@RequestBody Post post){
        postService.addPost(post);
        return "redirect:/posts"; // show updated data OR delete line,return void
    }

    @PutMapping("/posts/{id}/update")
    public void updatePost(@RequestBody Post post){
        postService.updatePost(post);
    }

    @DeleteMapping("/posts/{id}/delete")
    public void deletePost(@PathVariable Integer id){
        postService.deletePost(id);
    }
}
