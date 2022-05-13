package com.socialmediaapp.socialapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("posts")
public class PostsModel {
    
    @Id
    private String id;

    private String title;
    private String body;
    private int likes;

    public PostsModel() {}

    public PostsModel(String title, String body, int likes) {
        this.title = title;
        this.body = body;
        this.likes = likes;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
