package com.hcl.bankapp.service;

import org.springframework.stereotype.Service;

import com.hcl.bankapp.entity.CustomerDetails;

@Service
public interface CustomerDetailsInterface {
	public CustomerDetails createCustomer(CustomerDetails customerDetails);
}
