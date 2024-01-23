package com.orange.projectmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.orange.projectmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}