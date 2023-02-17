package com.example.demoweb.controller;

import com.example.demoweb.com.example.demoweb.service.LikesService;
import com.example.demoweb.com.example.demoweb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class LikesController {

    @Autowired
    LikesService likesService;
    @ResponseBody
    @RequestMapping(path = "/post/{id}/like", method = RequestMethod.POST)
    public String like(@PathVariable("id") Long id) {
        int likes = likesService.like(id);
        return "" + likes;
    }
}
