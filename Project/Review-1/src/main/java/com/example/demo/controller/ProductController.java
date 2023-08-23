package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ProductEntity;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService ser;
	
	@PostMapping("proadd")
	public String add(@RequestBody ProductEntity pro)
	{
		return ser.addinfo(pro);
	}
	
	@PostMapping("proaddn")
	public String addn(@RequestBody List<ProductEntity> pro) {
		return ser.addninfo(pro);
	}
	
	@GetMapping("proshow")
	public List<ProductEntity> show(){
		return ser.showinfo();
	}
	
	@GetMapping("proshow/{id}")
	public Optional<ProductEntity> showid(@PathVariable int id){
		return ser.showid(id);
	}
	
	@GetMapping("proshowparam")
	public Optional<ProductEntity> showparam(@RequestParam int id){
		return ser.showid(id);
	}
	
	@PutMapping("proupdate")
	public String update(@RequestBody ProductEntity pro) {
		return ser.changeinfo(pro);
	}
	
	@PutMapping("proupdate/{id}")
	public String updateid(@PathVariable int id ,@RequestBody ProductEntity pro) {
		return ser.changeinfoid(id,pro);
	}
	
	@DeleteMapping("prodelete")
	public String delete(@RequestBody ProductEntity pro) {
		return ser.deleteinfo(pro);
	}
	
	@DeleteMapping("prodeleteid/{id}")
	public String deleteid(@PathVariable int id) {
		return ser.deleteinfoid(id);
	}
	
	@DeleteMapping("prodeleteparam")
	public String deleteparam(@RequestParam int id) {
		return ser.deleteinfoid(id);
	}
}