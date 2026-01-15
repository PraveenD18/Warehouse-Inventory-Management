package com.ey.model;

import jakarta.persistence.*;

@Entity
@Table(name = "purchase_order_items")
public class PurchaseOrderItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional=false)
    @JoinColumn(name="po_id")
    private PurchaseOrder purchaseOrder;

    @ManyToOne(optional=false)
    private Item item;

    private Integer orderedQty;
    private Integer receivedQty;
}
