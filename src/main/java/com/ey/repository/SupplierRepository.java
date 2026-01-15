package com.ey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ey.model.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
