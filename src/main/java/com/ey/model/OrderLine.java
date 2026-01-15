package com.ey.model;

import jakarta.persistence.*;

@Entity
@Table(name = "order_lines")
public class OrderLine {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional=false)
    @JoinColumn(name="order_id")
    private Order order;

    @ManyToOne(optional=false)
    private Item item;

    private Integer orderedQty;
    private Integer allocatedQty;
}

