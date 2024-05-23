//package com.customer.management.test.customerservice;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.customer.management.entity.Customer;
//import com.customer.management.repository.CustomerRepository;
//import com.customer.management.service.CustomerService;
//
//@SpringBootTest
//public class CustomerServiceImplTest {
//	
//	@Autowired
//    private CustomerService customerService;
//	
//	@Autowired
//	private CustomerRepository customerRepository;
//	
//	@Test
//	public void addCustomer() {
//	    // Given
//	    Customer newCustomer = new Customer();
//	    newCustomer.setCustomerId(98766);
//	    newCustomer.setCustomerName("John Doe");
//	    newCustomer.setCustomerAddress("123 Main St");
//	    newCustomer.setCustomerGender("Male");
//
//	    // When
//	    Customer createdCustomer = customerService.addCustomer(newCustomer);
//
//	    // Then
//	    assertNotNull(createdCustomer.getCustomerId());
//	    assertEquals(newCustomer.getCustomerName(), createdCustomer.getCustomerName());
//	    assertEquals(newCustomer.getCustomerAddress(), createdCustomer.getCustomerAddress());
//	    assertEquals(newCustomer.getCustomerGender(), createdCustomer.getCustomerGender());
//	}
//
//
////	 @Test
////	    public void testGetCustomerById() {
////	        Customer existingCustomer = new Customer();
////	        
////	        existingCustomer = customerRepository.save(existingCustomer);
////	        
////	        Customer retrievedCustomer = customerService.getCustomerById(existingCustomer.getCustomerId());
////
////	        assertNotNull(retrievedCustomer);
////	        assertEquals(existingCustomer.getCustomerId(), retrievedCustomer.getCustomerId());
////	        assertEquals(existingCustomer.getCustomerName(), retrievedCustomer.getCustomerName());
////	        assertEquals(existingCustomer.getCustomerContactNo(), retrievedCustomer.getCustomerContactNo());
////	        assertEquals(existingCustomer.getCustomerAddress(), retrievedCustomer.getCustomerAddress());
////	        assertEquals(existingCustomer.getCustomerGender(), retrievedCustomer.getCustomerGender());
////
////
////	    }
//
//}
