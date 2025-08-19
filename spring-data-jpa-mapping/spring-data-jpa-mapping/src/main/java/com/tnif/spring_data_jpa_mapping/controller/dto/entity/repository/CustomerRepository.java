package com.tnif.spring_data_jpa_mapping.controller.dto.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.tnif.spring_data_jpa_mapping.controller.dto.OrderResponse;
import com.tnif.spring_data_jpa_mapping.controller.dto.entity.Customer;
import java.util.List;
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	@Query("SELECT new com.javatechie.jpa.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}