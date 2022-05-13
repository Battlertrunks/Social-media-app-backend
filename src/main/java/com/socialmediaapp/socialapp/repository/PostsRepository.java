package com.socialmediaapp.socialapp.repository;

import com.socialmediaapp.socialapp.model.PostsModel;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostsRepository extends MongoRepository<PostsModel, String> {
    
}
