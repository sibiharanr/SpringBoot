package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CustomersEntity {

	@Id
	private Integer customer_id;
	
	private String firstname;
	
	private String lastname;
	
	@Column(name = "Emailid")
	private String customer_email;
	
	private String phone_number;

	public CustomersEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomersEntity(Integer customer_id, String firstname, String lastname, String customer_email,
			String phone_number) {
		super();
		this.customer_id = customer_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.customer_email = customer_email;
		this.phone_number = phone_number;
	}

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCustomer_email() {
		return customer_email;
	}

	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	
}