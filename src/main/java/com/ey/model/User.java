package com.ey.model;

import com.ey.enums.Role;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false, unique=true)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private Role role;

    @Column(nullable=false)
    private String password;

    // Bidirectional with PickTask (assignee)
    @OneToMany(mappedBy = "assignedTo")
    private Set<PickTask> pickTasks;
}
