package com.example.springcrudmongodb.controller;

import com.example.springcrudmongodb.model.Blog;
import com.example.springcrudmongodb.service.BlogService;
import com.example.springcrudmongodb.service.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController

public class BlogController {
    private final BlogServiceImpl blogService;

    public BlogController( @Autowired BlogServiceImpl service){
        this.blogService=service;
    }
    @GetMapping("/all")
    public List<Blog> getAllBlogs(){
        return blogService.findAll();
    }
    @GetMapping("/title/{title}")
    public List<Blog> getBlogByTitle(@PathVariable String title){
        return blogService.findByTitle(title);
    }
    @GetMapping("/id/{id}")
    public Blog getBlogById(@PathVariable String id){
        return blogService.findById(id);
    }


    @PostMapping("/create")
    public Blog create(@RequestBody Blog blog){
        blog.setBlogId(UUID.randomUUID().toString());
        return blogService.create(blog);
    }
    @PostMapping("/update")
    public Blog update(@RequestBody Blog blog){
        return blogService.update(blog);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(@PathVariable String id){
         blogService.delete(id);
    }
}
