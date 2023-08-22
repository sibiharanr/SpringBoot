package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Book;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
	
	@Autowired
	ApiService aser;
	
	@PostMapping("add")
	public List<Book> add(@RequestBody List<Book> b) {
		return aser.saveinfo(b);
	}
	@GetMapping("show")
	public List<Book> show(){
		return aser.showinfo();
	}
	@GetMapping("showid/{id}")
	public Optional<Book> showid(@PathVariable int id) {
		return aser.showbyid(id);
	}
	@PutMapping("update/{id}")
	public String change(@PathVariable int id,@RequestBody Book b) {
		return aser.changeid(id, b);
	}
	@DeleteMapping("delete/{id}")
	public String delid(@PathVariable int id) {
		aser.deletebyid(id);
		return "Deleted";
	}
}
