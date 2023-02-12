package com.example.demoweb.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {
    private final String text;
    private Integer likes;
    private final Date creationDate;

    public Post(String text, Date date) {
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
