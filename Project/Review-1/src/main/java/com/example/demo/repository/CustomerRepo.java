package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.CustomersEntity;

public interface CustomerRepo extends JpaRepository<CustomersEntity, Integer>{

}
