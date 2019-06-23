package com.hcl.bankapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bankapp.entity.CustomerDetails;
import com.hcl.bankapp.repository.CustomerDetailsReporsitory;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsInterface {
	@Autowired
	CustomerDetailsReporsitory customerDetailsRepo;

	@Override
	public CustomerDetails createCustomer(CustomerDetails customerDetails) {

		return customerDetailsRepo.save(customerDetails);
	}

}
