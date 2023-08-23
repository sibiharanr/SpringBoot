package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.OrdersEntity;
import com.example.demo.repository.OrderRepo;

@Service
public class OrderService {

	@Autowired
	OrderRepo rep;
	
	// to add Single detail
		public String addinfo(OrdersEntity ord)
		{
			if(rep.existsById(ord.getOrder_id()))
			{
				return "Duplication of Id not allowed";
			}
			else
			{
				rep.save(ord);
				return "Data added Successfully";
			}
		}
		
		// to add list of details
		public String addninfo(List<OrdersEntity> ord)
		{
			if(rep.existsById(ord.get(0).getOrder_id()))
			{
				return "Duplication of Id not allowed";
			}
			else
			{
				rep.saveAll(ord);
				return "All Data's added successfully";
			}
		}
		
		// to display all details
		public List<OrdersEntity> showinfo(){
			return rep.findAll();
		}
		
		// to display the specific detail by id
		public Optional<OrdersEntity> showid(int id) {
			return rep.findById(id);
		}
		
		// to update changes in database
		public String changeinfo(OrdersEntity ord) {
			if(rep.existsById(ord.getOrder_id()))
			{
				rep.saveAndFlush(ord);
				return "Updated Successfully";
			}
			else
			{
				return "Invalid request for updation";
			}
		}
		
		// to update by id in database
		public String changeinfoid(int id,OrdersEntity ord) {
			if(rep.existsById(id))
			{
				rep.saveAndFlush(ord);
				return "Updated Successfully";
			}
			else
			{
				return "Invalid request for updation";
			}
		}
		
		// to delete an row by specifying the whole data
		public String deleteinfo(OrdersEntity ord) {
			if(rep.existsById(ord.getOrder_id()))
			{
				rep.delete(ord);
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