package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Child;
import com.example.demo.Services.ApiService;

@RestController
public class ApiController {
	
	@Autowired
	ApiService api;
	
	@PostMapping("/")
	public List<Child> add(@RequestBody List<Child> c){
		return api.savedetails(c);
	}
	
	@GetMapping("{field}")
	public List<Child> sort(@PathVariable String field){
		return api.sortinfo(field);
	}
	
	@GetMapping("{offset}/{pagesize}")
	public List<Child> show(@PathVariable int offset,@PathVariable int pagesize){
		return api.getpage(offset,pagesize);
	}
	
	@GetMapping("{offset}/{pagesize}/{field}")
	public List<Child> showsort(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field){
		return api.getbypage(offset,pagesize,field);
	}

}
