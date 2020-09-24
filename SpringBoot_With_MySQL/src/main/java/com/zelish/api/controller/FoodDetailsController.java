package com.zelish.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zelish.api.dao.FoodDetailsDAO;
import com.zelish.api.model.DeliveryDetails;



@RestController
public class FoodDetailsController {



	@Autowired
	private FoodDetailsDAO dao;

	@PostMapping("/create")
	public String bookOrder(@RequestBody DeliveryDetails details) {
		dao.save(details);
		return "order booked sucessfully....  ";
	}

	@GetMapping("/getdetails")
	public List<DeliveryDetails> getDetails() {
		return (List<DeliveryDetails>) dao.findAll();
	}

	@DeleteMapping("/delete")
	public String deleteOrder( DeliveryDetails details) {
		dao.delete(details);
		return "order delete sucessfully....  ";
	}

	@PutMapping("/update")  
	private DeliveryDetails update(@RequestBody DeliveryDetails details)   
	{  
		dao.save(details) ; 
		return details;  
	}  


	@PutMapping("/getdetails/{id}")
	public Optional<DeliveryDetails> getEmployeesByDept(@PathVariable int id) {
		return dao.findById(id);
	}

}
