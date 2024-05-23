package com.customer.management.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.management.entity.Customer;
import com.customer.management.service.CustomerService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Customer Management Sevice Endpoints")
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/addCustomer")
	ResponseEntity<Customer> addCustomer(
			@RequestBody Customer customer)
	{
		return ResponseEntity.status(HttpStatus.OK).body(customerService.addCustomer(customer));
	}
	
	@PutMapping("/updateCustomer")
	public ResponseEntity<Customer> updateCustomer(
	        @RequestBody Customer customer,
	        @PathVariable("customerId") String customerId
	) {
	    Customer updatedCustomer = customerService.updateCustomer(customer, customerId);
	    return ResponseEntity.status(HttpStatus.CREATED).body(updatedCustomer);
	}

	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers()
	{
		return customerService.getAllCustomers();
	}

	@GetMapping("/getCustomerById")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("customerId") String customerId) {
	    Customer customer = customerService.getCustomerById(customerId);
	    if (customer != null) {
	        return new ResponseEntity<>(customer, HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}

	@DeleteMapping("/deleteCustomerById")
	public String deleteCustomerById(@PathVariable("customerId") String customerId)
	{
		return customerService.deleteCustomerById(customerId);
	}
}
