package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.OrdersEntity;

public interface OrderRepo extends JpaRepository<OrdersEntity, Integer>{

}
