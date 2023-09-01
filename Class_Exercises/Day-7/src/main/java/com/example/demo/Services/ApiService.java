package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Car;
import com.example.demo.Repositories.CarRepo;

@Service
public class ApiService {
	
	@Autowired
	CarRepo cr;
	
	public List<Car> savedetails(List<Car> c){
		return (List<Car>) cr.saveAll(c);
	}
	
	public List<Car> carown(int owner){
		return cr.carqown(owner);
	}
	public List<Car> caradd(String address){
		return cr.carqadd(address);
	}
	public List<Car> carname(String name){
		return cr.carqcar(name);
	}
	public List<Car> cars(int owner,String name){
		return cr.carqq(owner, name);
	}
}
