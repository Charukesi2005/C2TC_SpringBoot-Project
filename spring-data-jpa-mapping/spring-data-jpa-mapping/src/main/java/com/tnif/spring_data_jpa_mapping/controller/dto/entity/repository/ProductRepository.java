package com.tnif.spring_data_jpa_mapping.controller.dto.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnif.spring_data_jpa_mapping.controller.dto.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}