package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class ApiService {
	
	@Autowired
	StudentRepo sr;
	
	public List<Student> saveinfo(List<Student> s) {
		return (List<Student>)sr.saveAll(s);
	}
	
	public List<Student> showinfo(){
		return sr.findAll();
	}
	
	public Student changeinfo(Student s) {
		return sr.saveAndFlush(s);
	}
	
	public void deleteinfo(Student s) {
		sr.delete(s);
	}
}
