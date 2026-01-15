package com.ey.model;

import com.ey.enums.BinType;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "locations")
public class Location {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long binId;

    private String zone;
    private String aisle;
    private String rack;

    @Column(name="bin_code")
    private String bin;

    @Enumerated(EnumType.STRING)
    private BinType binType;

    @OneToMany(mappedBy = "bin")
    private Set<Inventory> inventories;
}
