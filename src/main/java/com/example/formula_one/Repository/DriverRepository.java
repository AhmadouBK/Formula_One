package com.example.formula_one.Repository;

import com.example.formula_one.Entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver,Integer> {
}
