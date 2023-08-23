package com.example.demo.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrdersEntity {
	
	@Id
	private Integer order_id;
	
	@Column(name = "Name")
	private String customer_name;
	
	private BigDecimal total_amount;	
	
	private String status;

	public OrdersEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrdersEntity(Integer order_id, String customer_name,BigDecimal total_amount,
			String status) {
		super();
		this.order_id = order_id;
		this.customer_name = customer_name;
		this.total_amount = total_amount;
		this.status = status;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public BigDecimal getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(BigDecimal total_amount) {
		this.total_amount = total_amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}