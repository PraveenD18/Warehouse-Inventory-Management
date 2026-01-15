package com.ey.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ey.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {}
