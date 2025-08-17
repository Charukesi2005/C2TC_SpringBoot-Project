package com.tnif.onetomanymapping.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnif.onetomanymapping.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}