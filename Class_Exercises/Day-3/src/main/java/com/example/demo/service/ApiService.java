package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ApiModel;
import com.example.demo.repository.ApiRepo;

@Service
public class ApiService {
	
	@Autowired
	ApiRepo ar;
	
	public ApiModel saveinfo(ApiModel am) {
		return ar.save(am);
	}
	
	public List<ApiModel> showinfo(){
		return ar.findAll();
	}
}
