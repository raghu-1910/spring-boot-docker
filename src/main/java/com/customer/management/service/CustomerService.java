package com.customer.management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.customer.management.entity.Customer;

public interface CustomerService {
	
	Customer addCustomer(Customer customer);
	
	Customer updateCustomer(Customer customer,String customerId);
	
	List<Customer> getAllCustomers();
	
	Customer getCustomerById(String customerId);

	String deleteCustomerById(String customerId);
	

}
