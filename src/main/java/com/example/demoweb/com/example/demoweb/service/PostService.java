package com.example.demoweb.com.example.demoweb.service;

import com.example.demoweb.model.Post;
import com.example.demoweb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public final ArrayList<Post> posts = new ArrayList<>();
    @Autowired
    PostRepository postRepository;

    public Iterable<Post> listAllPosts(){
        return postRepository.findAll();
    }
    public void create(String text) {
        posts.add(new Post(null, text, new Date()));
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }
}
