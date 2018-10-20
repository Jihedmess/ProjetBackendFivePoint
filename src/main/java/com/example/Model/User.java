package com.example.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Document(collection ="User")
public class User {
	
	@Id
	private int id;
	private String name;
	private String  email;
	private String password;
		

}
