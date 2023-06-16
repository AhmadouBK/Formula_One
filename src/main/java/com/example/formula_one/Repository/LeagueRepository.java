package com.example.formula_one.Repository;

import com.example.formula_one.Entity.League;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeagueRepository extends JpaRepository<League,Integer> {
}
