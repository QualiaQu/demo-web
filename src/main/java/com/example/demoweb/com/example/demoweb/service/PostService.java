package com.example.demoweb.com.example.demoweb.service;

import ch.qos.logback.core.BasicStatusManager;
import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private final List<Post> posts = List.of(
            new Post("Пост 1", new Date()),
            new Post("Пост 2", new Date()),
            new Post("Пост 3", new Date())
    );

    public List<Post> listAllPosts(){
        return posts;
    }
    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
