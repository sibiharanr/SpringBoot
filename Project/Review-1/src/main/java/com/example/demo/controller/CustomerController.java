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

import com.example.demo.model.CustomersEntity;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService ser;
	
	@PostMapping("cusadd")
	public String add(@RequestBody CustomersEntity cus)
	{
		return ser.addinfo(cus);
	}
	
	@PostMapping("cusaddn")
	public String addn(@RequestBody List<CustomersEntity> cus) {
		return ser.addninfo(cus);
	}
	
	@GetMapping("cusshow")
	public List<CustomersEntity> show(){
		return ser.showinfo();
	}
	
	@GetMapping("cusshow/{id}")
	public Optional<CustomersEntity> showid(@PathVariable int id){
		return ser.showid(id);
	}
	
	@GetMapping("cusshowparam")
	public Optional<CustomersEntity> showparam(@RequestParam int id){
		return ser.showid(id);
	}
	
	@PutMapping("cusupdate")
	public String update(@RequestBody CustomersEntity cus) {
		return ser.changeinfo(cus);
	}
	
	@PutMapping("cusupdate/{id}")
	public String updateid(@PathVariable int id ,@RequestBody CustomersEntity cus) {
		return ser.changeinfoid(id,cus);
	}
	
	@DeleteMapping("cusdelete")
	public String delete(@RequestBody CustomersEntity cus) {
		return ser.deleteinfo(cus);
	}
	
	@DeleteMapping("cusdelete/{id}")
	public String deleteid(@PathVariable int id) {
		return ser.deleteinfoid(id);
	}
	
	@DeleteMapping("cusdeleteparam")
	public String deleteparam(@RequestParam int id) {
		return ser.deleteinfoid(id);
	}
}