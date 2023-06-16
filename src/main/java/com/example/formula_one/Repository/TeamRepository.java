package com.example.formula_one.Repository;

import com.example.formula_one.Entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team,Integer> {
}
