package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Car;
import com.example.demo.Services.ApiService;

@RestController
public class ApiController {
	
	@Autowired
	ApiService api;
	
	@PostMapping("/")
	public List<Car> add(@RequestBody List<Car> c){
		return api.savedetails(c);
	}
	
	@GetMapping("/owners/{owners}")
	public List<Car> showown(@PathVariable int owners){
		return api.carown(owners);
	}
	@GetMapping("/address/{address}")
	public List<Car> showadd(@PathVariable String address){
		return api.caradd(address);
	}
	@GetMapping("/carName/{carName}")
	public List<Car> showname(@PathVariable String carName){
		return api.carname(carName);
	}
	@GetMapping("/owners/{owners}/carType/{carType}")
	public List<Car> shows(@PathVariable int owners,@PathVariable String carType){
		return api.cars(owners, carType);
	}
}
