package com.ey.model;

import com.ey.enums.MovementType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "stock_movements")
public class StockMovement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long movementId;

	@Enumerated(EnumType.STRING)
	private MovementType movementType;

	@ManyToOne(optional = false)
	private Item item;

	@ManyToOne
	@JoinColumn(name = "from_bin_id")
	private Location fromBin;

	@ManyToOne
	@JoinColumn(name = "to_bin_id")
	private Location toBin;

	private Integer qty;
}
