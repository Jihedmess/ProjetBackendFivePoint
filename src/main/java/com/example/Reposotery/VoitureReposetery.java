package com.example.Reposotery;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Model.Voiture;

public interface VoitureReposetery extends MongoRepository<Voiture, Integer> {

}
