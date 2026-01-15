package com.ey.model;

import com.ey.enums.PickTaskStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "pick_tasks")
public class PickTask {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pickTaskId;

    @ManyToOne(optional=false)
    @JoinColumn(name="order_id")
    private Order order;

    @ManyToOne(optional=false)
    private Item item;

    private Integer qty;

    @ManyToOne
    @JoinColumn(name="assigned_to")
    private User assignedTo;

    @Enumerated(EnumType.STRING)
    private PickTaskStatus status;
}

