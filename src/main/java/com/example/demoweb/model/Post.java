package com.example.demoweb.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {
    private final String text;
    private final Long id;
    private int likes;
    private final Date creationDate;

    public Post(long id, String text, Date date) {
        this.id = id;
        this.text = text;
        this.creationDate = date;
    }
    public Long getId() {
        return id;
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    public String getText() {
        return text;
    }
    public int getLikes() {
        return likes;
    }
    public Date getCreationDate() {
        return creationDate;
    }
}
