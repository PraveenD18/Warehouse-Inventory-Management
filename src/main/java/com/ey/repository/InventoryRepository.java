package com.ey.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ey.model.Inventory;
import com.ey.model.Item;
import com.ey.model.Location;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    Optional<Inventory> findByItemAndBin(Item item, Location bin);
}