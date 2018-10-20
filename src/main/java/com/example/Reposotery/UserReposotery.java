package com.example.Reposotery;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Model.User;

public interface UserReposotery extends MongoRepository<User, Integer> {

}
