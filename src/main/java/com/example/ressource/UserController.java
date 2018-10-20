package com.example.ressource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.User;
import com.example.Reposotery.UserReposotery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class UserController {
	
	
	@Autowired
	UserReposotery userrepo ;
	
	@PostMapping("/user")
	public String postMethodName(@RequestBody User user) {
		 userrepo.save(user) ;
			return "Save avec Success" ;
		
	}
	
	
	@GetMapping("/users")
	public List<User> getListUser() {
		return  userrepo.findAll();
	}
	

}
