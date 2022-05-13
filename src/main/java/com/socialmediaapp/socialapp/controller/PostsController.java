package com.socialmediaapp.socialapp.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import com.socialmediaapp.socialapp.model.PostsModel;
import com.socialmediaapp.socialapp.repository.PostsRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/posts")
public class PostsController {
    
    private final PostsRepository postsRepository;

    public PostsController(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    @GetMapping
    public List<PostsModel> getPosts() {
        return this.postsRepository.findAll();
    }

    @PostMapping
    public ResponseEntity createPost(@RequestBody PostsModel postsModel) throws URISyntaxException {
        PostsModel savedPost = postsRepository.save(postsModel);
        return ResponseEntity.created(new URI("/posts/" + savedPost.getId())).body(savedPost);
    }
}
