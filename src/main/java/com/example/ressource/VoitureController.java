package com.example.ressource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Voiture;
import com.example.Reposotery.VoitureReposetery;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class VoitureController {
	
	@Autowired
	VoitureReposetery voiturereposetery;
	
	
	@PostMapping("/voiture")
	public String postMethodName(@RequestBody Voiture voiture) {
		voiturereposetery.save(voiture);
		
		return  "Save with success" ;
	}
	
	
	@GetMapping("/voitures")
	public List<Voiture> getMethodName() {
		return voiturereposetery.findAll();
	}
	
	
	

}
