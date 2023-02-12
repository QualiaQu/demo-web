package com.example.demoweb.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {
    private final String text;
    private Integer likes;
    private final Date creationDate;

    public Post(String text) {
        this.text = text;
        this.creationDate = new Date();
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
