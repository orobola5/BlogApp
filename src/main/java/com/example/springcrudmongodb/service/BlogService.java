package com.example.springcrudmongodb.service;

import com.example.springcrudmongodb.Repository.BlogRepository;
import com.example.springcrudmongodb.model.Blog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class BlogService implements BlogServiceImpl{
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Blog create(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public List<Blog> findByTitle(String title) {
        log.info("###### FIND BY TITLE {}",title);
        List<Blog>blogList=blogRepository.findByTitle(title);
        log.info("###### FIND BY blogList {}",blogList);
        return blogList;
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

    @Override
    public Blog findById(String id) {
        return blogRepository.findById(id).get();
    }
}
