package com.example.formula_one.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Driver {
    @Id
    @Column(unique = true, updatable = false, nullable = false)
    private Integer driver_number;
    @Column(nullable = false)
    private String name;
    @Column
    private Integer driver_points;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_number")
    private Team team;
}
