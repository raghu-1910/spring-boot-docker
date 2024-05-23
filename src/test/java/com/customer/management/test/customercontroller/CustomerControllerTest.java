//package com.customer.management.test.customercontroller;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.customer.management.controller.CustomerController;
//import com.customer.management.entity.Customer;
//import com.customer.management.service.CustomerService;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//@WebMvcTest(CustomerController.class)
//public class CustomerControllerTest {
//	
//	@MockBean
//	private CustomerService customerService;
//	
//	@Autowired
//	private MockMvc mockMvc;
//	
//	@Test
//	public void test_addCUstomer() throws JsonProcessingException, Exception
//	{
//		Customer customer = new Customer(765,"rahul","Delhi","male");
//		when(customerService.addCustomer(customer)).thenReturn(customer);
//		mockMvc.perform(post("/customer/addCustomer")
//				.contentType(MediaType.APPLICATION_JSON)
//				.content(new ObjectMapper().writeValueAsString(customer)))
//				.andExpect(status().isOk());
//	}
//	
//	@Test
//	public void test_getCustomerById() throws Exception {
//	    Customer customer = new Customer(765, "rahul", "Delhi", "male");
//	    when(customerService.getCustomerById(765)).thenReturn(customer);
//	    
//	    mockMvc.perform(get("/customer/getCustomerById/765")
//	            .contentType(MediaType.APPLICATION_JSON))
//	            .andExpect(status().isOk())
//	            .andExpect(jsonPath("$.customerName").value(customer.getCustomerName()));
//	}
//	@Test
//	public void test_getAllCustomers() throws Exception {
//	    List<Customer> customers = Arrays.asList(
//	            new Customer(111, "raghav", "Banglore", "Male"),
//	            new Customer(222, "Nikku", "Noida", "Female"));
//
//	    when(customerService.getAllCustomers()).thenReturn(customers);
//
//	    mockMvc.perform(get("/customer/getAllCustomers")
//	            .contentType(MediaType.APPLICATION_JSON))
//	            .andExpect(status().isOk())
//	            .andExpect(jsonPath("$[0].customerId", is(111)))
//	            .andExpect(jsonPath("$[0].customerName", is("raghav")))
//	            .andExpect(jsonPath("$[0].customerContactNo", is("1234567890")))
//	            .andExpect(jsonPath("$[0].customerAddress", is("Banglore")))
//	            .andExpect(jsonPath("$[0].customerGender", is("Male")))
//	            .andExpect(jsonPath("$[1].customerId", is(222)))
//	            .andExpect(jsonPath("$[1].customerName", is("Nikku")))
//	            .andExpect(jsonPath("$[1].customerContactNo", is("9876543210")))
//	            .andExpect(jsonPath("$[1].customerAddress", is("Noida")))
//	            .andExpect(jsonPath("$[1].customerGender", is("Female")));
//	}
//
//}
