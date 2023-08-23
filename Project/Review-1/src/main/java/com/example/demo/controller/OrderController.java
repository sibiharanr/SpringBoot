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

import com.example.demo.model.OrdersEntity;
import com.example.demo.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService ser;
	
	@PostMapping("ordadd")
	public String add(@RequestBody OrdersEntity ord)
	{
		return ser.addinfo(ord);
	}
	
	@PostMapping("ordaddn")
	public String addn(@RequestBody List<OrdersEntity> ord) {
		return ser.addninfo(ord);
	}
	
	@GetMapping("ordshow")
	public List<OrdersEntity> show(){
		return ser.showinfo();
	}
	
	@GetMapping("ordshow/{id}")
	public Optional<OrdersEntity> showid(@PathVariable int id){
		return ser.showid(id);
	}
	
	@GetMapping("ordshowparam")
	public Optional<OrdersEntity> showparam(@RequestParam int id){
		return ser.showid(id);
	}
	
	@PutMapping("ordupdate")
	public String update(@RequestBody OrdersEntity ord) {
		return ser.changeinfo(ord);
	}
	
	@PutMapping("ordupdate/{id}")
	public String updateid(@PathVariable int id ,@RequestBody OrdersEntity ord) {
		return ser.changeinfoid(id,ord);
	}
	
	@DeleteMapping("orddelete")
	public String delete(@RequestBody OrdersEntity ord) {
		return ser.deleteinfo(ord);
	}
	
	@DeleteMapping("orddelete/{id}")
	public String deleteid(@PathVariable int id) {
		return ser.deleteinfoid(id);
	}
	
	@DeleteMapping("orddeleteparam")
	public String deleteparam(@RequestParam int id) {
		return ser.deleteinfoid(id);
	}
}