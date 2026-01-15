package com.ey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ey.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {}

