package com.hcl.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.bankapp.service.CustomerDetailsInterface;

@RestController
@RequestMapping("/customer")
public class CustomerDetails {
	@Autowired
	CustomerDetailsInterface customerDetailsInterface;

	@PostMapping(value = "/create")
	public com.hcl.bankapp.entity.CustomerDetails createCustomer(@RequestBody com.hcl.bankapp.entity.CustomerDetails customerDetails) {
		return customerDetailsInterface.createCustomer(customerDetails);
	}

}
