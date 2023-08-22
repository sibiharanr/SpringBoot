package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{

}
