package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CustomersEntity;
import com.example.demo.repository.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo rep;
	
	// to add Single detail
			public String addinfo(CustomersEntity cus)
			{
				if(rep.existsById(cus.getCustomer_id()))
				{
					return "Duplication of Id not allowed";
				}
				else
				{
					rep.save(cus);
					return "Data added Successfully";
				}
			}
			
			// to add list of details
			public String addninfo(List<CustomersEntity> cus)
			{
				if(rep.existsById(cus.get(0).getCustomer_id()))
				{
					return "Duplication of Id not allowed";
				}
				else
				{
					rep.saveAll(cus);
					return "All Data's added successfully";
				}
			}
			
			// to display all details
			public List<CustomersEntity> showinfo(){
				return rep.findAll();
			}
			
			// to display the specific detail by id
			public Optional<CustomersEntity> showid(int id) {
				return rep.findById(id);
			}
			
			// to update changes in database
			public String changeinfo(CustomersEntity cus) {
				if(rep.existsById(cus.getCustomer_id()))
				{
					rep.saveAndFlush(cus);
					return "Updated Successfully";
				}
				else
				{
					return "Invalid request for updation";
				}
			}
			
			// to update by id in database
			public String changeinfoid(int id,CustomersEntity cus) {
				if(rep.existsById(id))
				{
					rep.saveAndFlush(cus);
					return "Updated Successfully";
				}
				else
				{
					return "Invalid request for updation";
				}
			}
			
			// to delete an row by specifying the whole data
			public String deleteinfo(CustomersEntity cus) {
				if(rep.existsById(cus.getCustomer_id()))
				{
					rep.delete(cus);
					return "Deleted Successfully";
				}
				else
				{
					return "Invalid request for deletion";
				}
			}
			
			// to delete by specifying the id
			public String deleteinfoid(int id) {
				if(rep.existsById(id))
				{
					rep.deleteById(id);
					return "Deleted Successfully";
				}
				else
				{
					return "Invalid request for deletion";
				}
			}
}