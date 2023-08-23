package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SuppliersEntity;

public interface SupplierRepo extends JpaRepository<SuppliersEntity, Integer>{

}
