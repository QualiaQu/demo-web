package com.example.demoweb.com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.beans.factory.annotation.Autowired;

public class LikesService {
    @Autowired
    PostService postService;

    public int like(Long id){
        Post post = postService.listAllPosts().get(id.intValue());
        post.setLikes(post.getLikes() + 1);
        return post.getLikes();
    }
}
