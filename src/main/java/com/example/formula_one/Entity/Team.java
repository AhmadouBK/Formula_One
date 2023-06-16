package com.example.formula_one.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    @Id
    @Column(unique = true, updatable = false, nullable = false)
    private Integer team_number;
    @Column(unique = true, nullable = false)
    private String name;
    @Column
    private Integer team_points;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "number")
    private League league;
}
