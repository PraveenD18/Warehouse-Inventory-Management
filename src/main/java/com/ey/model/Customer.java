package com.ey.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerId;

	private String name;
	private String phone;
	private String address;
	private String pincode;

	@OneToMany(mappedBy = "customer")
	private List<Order> orders;
}
