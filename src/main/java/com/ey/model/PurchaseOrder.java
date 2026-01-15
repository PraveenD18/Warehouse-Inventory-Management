package com.ey.model;

import com.ey.enums.PurchaseOrderStatus;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "purchase_orders")
public class PurchaseOrder {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long poId;

    @ManyToOne(optional=false)
    private Supplier supplier;

    @Enumerated(EnumType.STRING)
    private PurchaseOrderStatus status;

    @OneToMany(mappedBy = "purchaseOrder", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PurchaseOrderItem> items;
}

