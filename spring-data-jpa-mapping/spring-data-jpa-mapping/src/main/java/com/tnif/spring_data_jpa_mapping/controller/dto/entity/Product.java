package com.tnsif.spring_data_jpa_mapping.controller.dto.entity;

import com.tnif.spring_data_jpa_mapping.controller.dto.AllArgsConstructor;
import com.tnif.spring_data_jpa_mapping.controller.dto.Data;
import com.tnif.spring_data_jpa_mapping.controller.dto.NoArgsConstructor;
import com.tnif.spring_data_jpa_mapping.controller.dto.ToString;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Product {
	 @Id
	    private int pid;
	    private String productName;
	    private int qty;
	    private int price;
}