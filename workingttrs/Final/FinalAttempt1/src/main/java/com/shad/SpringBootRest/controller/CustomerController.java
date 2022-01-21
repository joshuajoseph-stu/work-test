package com.shad.SpringBootRest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shad.SpringBootRest.entity.Customer;
import com.shad.SpringBootRest.entity.Ticket;
import com.shad.SpringBootRest.service.CustomerService;
@RequestMapping("/api")
@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/custmoer/{customerId}")
	public Optional<Customer> getCustmoertById(@PathVariable int CustomerId) {
		return customerService.getCustomer(CustomerId);
	}
	@PostMapping("/signup")
	public Customer saveCustomer(Customer customer) {
		return customerService.saveCustomer(customer);
	}

	@PostMapping("/login")
	public String doLogin(String email, String password) {

		Optional<Customer> optonal = customerService.getCustomer(email, password);

		if (optonal.isEmpty()) {
			return "Failure";
		} else {

			return "Success";
		}
	}

}
