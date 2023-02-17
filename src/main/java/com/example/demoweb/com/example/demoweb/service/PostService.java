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
    public final ArrayList<Post> posts = new ArrayList<>();

    public ArrayList<Post> listAllPosts(){
        return posts;
    }
    public void create(String text) {
        posts.add(new Post(posts.size(), text, new Date()));
    }
}
