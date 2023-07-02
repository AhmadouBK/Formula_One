package com.example.formula_one.Repository;

import com.example.formula_one.Entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team,Integer> {
    @Query("SELECT t FROM Team t ORDER BY t.team_points DESC")
    List<Team> findAllByOrderByTeamPointsDesc();
}
