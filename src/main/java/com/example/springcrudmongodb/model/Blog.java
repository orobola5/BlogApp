package com.example.springcrudmongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collation = "Blog")
public class Blog {
    @Id
    private  String blogId;
    private String title;
    private String content;
}
