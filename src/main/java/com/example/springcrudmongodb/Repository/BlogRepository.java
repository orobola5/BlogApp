package com.example.springcrudmongodb.Repository;

import com.example.springcrudmongodb.model.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends MongoRepository<Blog,String> {
@Query("{'title':?0}")
  public List<Blog>findByTitle(String title);

}
