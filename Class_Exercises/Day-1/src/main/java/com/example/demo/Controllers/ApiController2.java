package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController2 {
	
	@Value("${Name}")
	String studentName;
	
	@GetMapping("/name")
	public String getName() {
		return "Welcome "+studentName+"!";
	}
}
