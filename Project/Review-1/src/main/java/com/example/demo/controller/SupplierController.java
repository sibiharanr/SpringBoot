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

import com.example.demo.model.SuppliersEntity;
import com.example.demo.service.SupplierService;

@RestController
public class SupplierController {

	@Autowired
	SupplierService ser;
	
	@PostMapping("sadd")
	public String add(@RequestBody SuppliersEntity s)
	{
		return ser.addinfo(s);
	}
	
	@PostMapping("saddn")
	public String addn(@RequestBody List<SuppliersEntity> s) {
		return ser.addninfo(s);
	}
	
	@GetMapping("sshow")
	public List<SuppliersEntity> show(){
		return ser.showinfo();
	}
	
	@GetMapping("sshow/{id}")
	public Optional<SuppliersEntity> showid(@PathVariable int id){
		return ser.showid(id);
	}
	
	@GetMapping("sshowparam")
	public Optional<SuppliersEntity> showparam(@RequestParam int id){
		return ser.showid(id);
	}
	
	@PutMapping("supdate")
	public String update(@RequestBody SuppliersEntity s) {
		return ser.changeinfo(s);
	}
	
	@PutMapping("supdate/{id}")
	public String updateid(@PathVariable int id ,@RequestBody SuppliersEntity s) {
		return ser.changeinfoid(id,s);
	}
	
	@DeleteMapping("sdelete")
	public String delete(@RequestBody SuppliersEntity s) {
		return ser.deleteinfo(s);
	}
	
	@DeleteMapping("sdelete/{id}")
	public String deleteid(@PathVariable int id) {
		return ser.deleteinfoid(id);
	}
	
	@DeleteMapping("sdeleteparam")
	public String deleteparam(@RequestParam int id) {
		return ser.deleteinfoid(id);
	}
}