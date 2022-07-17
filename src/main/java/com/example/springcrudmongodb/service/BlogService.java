package com.example.springcrudmongodb.service;

import com.example.springcrudmongodb.Repository.BlogRepository;
import com.example.springcrudmongodb.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogService implements BlogServiceImpl{
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Blog create(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public List<Blog> findByTitle(String title) {
        return blogRepository.findByTitle(title);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public void delete(String id) {
        blogRepository.deleteById(id);

    }

    @Override
    public Blog update(Blog blog) {
        return blogRepository.save(blog);
    }
}
