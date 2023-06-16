package com.example.formula_one.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
