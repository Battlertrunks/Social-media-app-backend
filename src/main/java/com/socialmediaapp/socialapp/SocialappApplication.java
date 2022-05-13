package com.socialmediaapp.socialapp;

import com.socialmediaapp.socialapp.repository.PostsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SocialappApplication implements CommandLineRunner {

	@Autowired
	PostsRepository postsRepository;

	public static void main(String[] args) {
		SpringApplication.run(SocialappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
