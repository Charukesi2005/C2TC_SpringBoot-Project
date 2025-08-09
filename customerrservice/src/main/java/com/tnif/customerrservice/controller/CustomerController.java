package com.tnif.customerrservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnif.customerrservice.entity.Customer;
import com.tnif.customerrservice.service.CustomerService;

import jakarta.persistence.NoResultException;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService c;
	@GetMapping("/customerrservice")
	public List<Customer> list(){
		return c.listAll();
	}
	
	@PostMapping("/customerrservice")
	public void add(@RequestBody Customer c1) {
		c.save(c1);
	}
	
	@GetMapping("/customerrservice/{id}")
	public ResponseEntity<Customer> get(@PathVariable Integer id){
		try {
			Customer c2 = c.get(id);
			return new ResponseEntity<Customer>(c2,HttpStatus.OK);
		}catch(NoResultException e) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/customerrservice/{id}")
	public void delete(@PathVariable Integer id) {
		c.delete(id);
	}
	
	@PutMapping("/customerrservice/{id}")
	public ResponseEntity<Customer> update(@PathVariable Integer id,@RequestBody Customer update_c){
		try {
			Customer exist_c = c.get(id);
			exist_c.setC_name(update_c.getC_name());
			exist_c.setAddress(update_c.getAddress());
			c.update(exist_c);
			return new ResponseEntity<Customer>(exist_c,HttpStatus.OK);
		}catch(NoResultException e) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}
	

}

