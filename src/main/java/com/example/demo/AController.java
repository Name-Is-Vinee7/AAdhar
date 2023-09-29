package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {
	
	@Autowired
	private AService service;
	
	@PostMapping("/AAdharcards")
	public AAdhar SaveAadhar(@RequestBody AAdhar aadhar) {
		return service.SaveAadhar(aadhar);
	}
	
	@GetMapping("/AAdharcards")
	public List<AAdhar> fetchAAdharList(){
		return service.fetchAAdharList();
	}
}
 