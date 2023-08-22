package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Book;
import com.example.demo.Repository.BookRepo;

@Service
public class ApiService {
	
	@Autowired
	BookRepo br;
	
	public List<Book> saveinfo(List<Book> b) {
		return (List<Book>)br.saveAll(b);
	}
	public List<Book> showinfo(){
		return br.findAll();
	}
	public Optional<Book> showbyid(int id) {
		return br.findById(id);
	}
	public String changeid(int id,Book b) {
		br.saveAndFlush(b);
		if(br.existsById(id))
			return "Updated";
		else
			return "Enter Valid Id";
	}
	public void deletebyid(int id) {
		br.deleteById(id);
	}
	
	
}
