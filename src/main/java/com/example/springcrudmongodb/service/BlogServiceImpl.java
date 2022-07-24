package com.example.springcrudmongodb.service;

import com.example.springcrudmongodb.model.Blog;

import java.util.List;

public interface BlogServiceImpl {
    Blog create (Blog blog);
   List<Blog> findByTitle(String title);
    List<Blog>findAll();
    void delete(String id);
    Blog update(Blog blog);
    Blog findById(String id);
}
