package com.example.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Document(collection= "voiture")
public class Voiture {
@Id
private int id;
private String Name;
private String marque;
private int votes;

}
