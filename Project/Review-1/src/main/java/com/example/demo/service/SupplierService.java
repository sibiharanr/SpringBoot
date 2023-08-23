package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.SuppliersEntity;
import com.example.demo.repository.SupplierRepo;

@Service
public class SupplierService {

	@Autowired
	SupplierRepo rep;
	
	// to add Single detail
		public String addinfo(SuppliersEntity s)
		{
			if(rep.existsById(s.getSupplier_id()))
			{
				return "Duplication of Id not allowed";
			}
			else
			{
				rep.save(s);
				return "Data added Successfully";
			}
		}
		
		// to add list of details
		public String addninfo(List<SuppliersEntity> s)
		{
			if(rep.existsById(s.get(0).getSupplier_id()))
			{
				return "Duplication of Id not allowed";
			}
			else
			{
				rep.saveAll(s);
				return "All Data's added successfully";
			}
		}
		
		// to display all details
		public List<SuppliersEntity> showinfo(){
			return rep.findAll();
		}
		
		// to display the specific detail by id
		public Optional<SuppliersEntity> showid(int id) {
			return rep.findById(id);
		}
		
		// to update changes in database
		public String changeinfo(SuppliersEntity s) {
			if(rep.existsById(s.getSupplier_id()))
			{
				rep.saveAndFlush(s);
				return "Updated Successfully";
			}
			else
			{
				return "Invalid request for updation";
			}
		}
		
		// to update by id in database
		public String changeinfoid(int id,SuppliersEntity s) {
			if(rep.existsById(id))
			{
				rep.saveAndFlush(s);
				return "Updated Successfully";
			}
			else
			{
				return "Invalid request for updation";
			}
		}
		
		// to delete an row by specifying the whole data
		public String deleteinfo(SuppliersEntity s) {
			if(rep.existsById(s.getSupplier_id()))
			{
				rep.delete(s);
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