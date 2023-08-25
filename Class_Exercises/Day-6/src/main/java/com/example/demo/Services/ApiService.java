package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Child;
import com.example.demo.Repositories.ChildRepo;

@Service
public class ApiService {
	
	@Autowired
	ChildRepo cr;
	
	public List<Child> savedetails(List<Child> c){
		return (List<Child>)cr.saveAll(c);
	}
	
	public List<Child> sortinfo(String c){
		return cr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,c));
	}
	
	public List<Child> getpage(int offset,int pagesize){
		Page<Child> p = cr.findAll(PageRequest.of(offset, pagesize));
		return p.getContent();
	}
	
	public List<Child> getbypage(int offset,int pagesize,String c){
		Page<Child> p = cr.findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.DEFAULT_DIRECTION,c)));
		return p.getContent();
	}
}
