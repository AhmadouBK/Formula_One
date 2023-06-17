package com.example.formula_one.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class League {
    @Id
    @Column(unique = true, nullable = false, updatable = false)
    private Integer number;
    @Column(unique = true, nullable = false, updatable = false)
    private String name;
}
