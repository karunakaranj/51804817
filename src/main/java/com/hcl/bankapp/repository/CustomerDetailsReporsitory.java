package com.hcl.bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.bankapp.entity.CustomerDetails;

@Repository
public interface CustomerDetailsReporsitory extends JpaRepository<CustomerDetails, Integer> {

}
