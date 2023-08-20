package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@Value("${Name}")
	String name;
	
	@GetMapping("/name")
	public String getName() {
		return name;
	}
}
