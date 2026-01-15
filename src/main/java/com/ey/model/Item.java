package com.ey.model;

import jakarta.persistence.*;
@Entity
@Table(name = "items")
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    @Column(nullable=false, unique=true)
    private String sku;

    private String name;
    private String category;

    @Column(nullable=false)
    private Integer reorderLevel;
}
