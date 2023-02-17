package com.example.demoweb.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {
    private final String text;

    public Long getId() {
        return id;
    }

    private Long id;

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    private Integer likes;
    private final Date creationDate;

    public Post(long id, String text, Date date) {
        this.id = id;
        this.text = text;
        this.creationDate = date;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
