package com.tnif.customerrservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnif.customerrservice.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
