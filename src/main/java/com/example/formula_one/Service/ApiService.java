package com.example.formula_one.Service;

import com.example.formula_one.Entity.Driver;
import com.example.formula_one.Entity.League;
import com.example.formula_one.Entity.Team;
import com.example.formula_one.Repository.DriverRepository;
import com.example.formula_one.Repository.LeagueRepository;
import com.example.formula_one.Repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ApiService {
    private final LeagueRepository leagueRepository;
    private final TeamRepository teamRepository;
    private final DriverRepository driverRepository;

    public League addLeague (League league){
        return leagueRepository.save(league);
    }
    public List<League> findAllLeague(){
        return leagueRepository.findAll(Sort.by(Sort.Direction.ASC, "number"));
    }
    public League updateLeague (League league){
        if (leagueRepository.existsById(league.getNumber())) {
            return leagueRepository.save(league);
        } else {
            throw new IllegalArgumentException("League does not exist.");
        }
    }
    public void deleteLeague (Integer id_league){
        if (leagueRepository.existsById(id_league)) {
            leagueRepository.deleteById(id_league);
        } else {
            throw new IllegalArgumentException("League does not exist.");
        }
    }

    public Team addTeam (Team team){
        return teamRepository.save(team);
    }
    public List<Team> findAllTeam(){
        return teamRepository.findAll(Sort.by("team_points"));
    }
    public Team updateTeam(Team team){
        if (teamRepository.existsById(team.getTeam_number())) {
            return teamRepository.save(team);
        } else {
            throw new IllegalArgumentException("Team does not exist.");
        }
    }

    public void deleteTeam (Integer id_team){
        if (teamRepository.existsById(id_team)) {
            teamRepository.deleteById(id_team);
        } else {
            throw new IllegalArgumentException("Team does not exist.");
        }
    }

    public Driver addDriver (Driver driver){
        return driverRepository.save(driver);
    }
    public List<Driver> findAllDriver(){
        return driverRepository.findAll(Sort.by("driver_points"));
    }
    public Driver updateDriver(Driver driver){
        if (driverRepository.existsById(driver.getDriver_number())) {
            return driverRepository.save(driver);
        } else {
            throw new IllegalArgumentException("Driver does not exist.");
        }
    }

    public void deleteDriver (Integer driver_id){
        if (driverRepository.existsById(driver_id)) {
            driverRepository.deleteById(driver_id);
        } else {
            throw new IllegalArgumentException("Driver does not exist.");
        }
    }
}
