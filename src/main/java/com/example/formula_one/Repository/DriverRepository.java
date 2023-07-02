package com.example.formula_one.Repository;

import com.example.formula_one.Entity.Driver;
import com.example.formula_one.Entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DriverRepository extends JpaRepository<Driver,Integer> {
    @Query("SELECT t FROM Driver t ORDER BY t.driver_points DESC")
    List<Driver> findAllByOrderByDriverPointsDesc();
}
