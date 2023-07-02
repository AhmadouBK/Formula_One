package com.example.formula_one.Controller;

import com.example.formula_one.Entity.Driver;
import com.example.formula_one.Entity.League;
import com.example.formula_one.Entity.Team;
import com.example.formula_one.Service.ApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/formula_one/home")
@RequiredArgsConstructor
public class ApiController {
    private final ApiService service;

    @GetMapping("/league")
    public ResponseEntity<List<League>> getAllLeagues() {
        List<League> leagues = service.findAllLeague();
        return ResponseEntity.ok(leagues);
    }
    @PostMapping("/league/add")
    public ResponseEntity<League> addLeague(@RequestBody League league) {
        League addedleague = service.addLeague(league);
        return ResponseEntity.ok(addedleague);
    }
    @PutMapping("/league/{id}")
    public ResponseEntity<League> updateLeague(@PathVariable("id") @RequestBody League updatedLeague) {
        updatedLeague = service.updateLeague(updatedLeague);
        return ResponseEntity.ok(updatedLeague);
    }
    @DeleteMapping("/league/{id}")
    public ResponseEntity<Void> deleteLeague(@PathVariable("id") Integer leagueId) {
        service.deleteLeague(leagueId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/team")
    public ResponseEntity<List<Team>> getAllTeams() {
        List<Team> teams = service.findAllTeam();
        return ResponseEntity.ok(teams);
    }
    @PostMapping("/team/add")
    public ResponseEntity<Team> addTeam(@RequestBody Team team) {
        Team addedteam = service.addTeam(team);
        return ResponseEntity.ok(addedteam);
    }
    @PutMapping("/team/{id}")
    public ResponseEntity<Team> updateTeam(@PathVariable("id") @RequestBody Team updatedTeam) {
        updatedTeam = service.updateTeam(updatedTeam);
        return ResponseEntity.ok(updatedTeam);
    }
    @DeleteMapping("/team/{id}")
    public ResponseEntity<Void> deleteTeam(@PathVariable("id") Integer teamId) {
        service.deleteLeague(teamId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/driver")
    public ResponseEntity<List<Driver>> getAllDrivers(){
        List<Driver> drivers = service.findAllDriver();
        return ResponseEntity.ok(drivers);
    }
    @PostMapping("/driver/add")
    public ResponseEntity<Driver> addDriver(@RequestBody Driver driver) {
        Driver addedDriver = service.addDriver(driver);
        return ResponseEntity.ok(addedDriver);
    }
    @PutMapping("/driver/{id}")
    public ResponseEntity<Driver> updateDriver(@PathVariable("id") @RequestBody Driver updatedDriver) {
        updatedDriver = service.updateDriver(updatedDriver);
        return ResponseEntity.ok(updatedDriver);
    }

    @DeleteMapping("/driver/{id}")
    public ResponseEntity<Void> deleteDriver(@PathVariable("id") Integer driverId) {
        service.deleteDriver(driverId);
        return ResponseEntity.noContent().build();
    }
}