package com.example.demoweb.repository;

import com.example.demoweb.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

}