package com.customer.management.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.management.entity.Customer;
import com.customer.management.exception.CustomerNotFoundException;
import com.customer.management.exception.CustomerUpdateException;
import com.customer.management.repository.CustomerRepository;
import com.customer.management.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer addCustomer(Customer customer) {
		String userId = UUID.randomUUID().toString();
        customer.setCustomerId(userId);
        System.out.println(customer.getCustomerId());
		return this.customerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer, String customerId) {
	    try {
	        Customer updatedCustomer = customerRepository.findById(customerId)
	                                                      .orElseThrow(() -> new CustomerNotFoundException("Customer not found with ID: " + customerId));
	        updatedCustomer.setCustomerName(customer.getCustomerName());
	        updatedCustomer.setCustomerAddress(customer.getCustomerAddress());
	        updatedCustomer.setCustomerGender(customer.getCustomerGender());
	        return customerRepository.save(updatedCustomer);
	    } catch (Exception e) {
	        throw new CustomerUpdateException("Error updating customer with ID: " + customerId, e);
	    }
	}


	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomerById(String customerId) {
		return customerRepository.findById(customerId).orElse(null);
	}
	
	@Override
	public String deleteCustomerById(String customerId) {
		Customer customer = customerRepository.findById(customerId).get();
		customerRepository.delete(customer);
		return "Customer Deleted Successfully";

}
}
