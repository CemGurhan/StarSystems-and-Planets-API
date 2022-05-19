package com.example.StarSystemsandPlanetsAPI.controller;

import com.example.StarSystemsandPlanetsAPI.model.Planet;
import com.example.StarSystemsandPlanetsAPI.service.PlanetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlanetController {

    private PlanetService planetService;

    public PlanetController(PlanetService planetService){
        this.planetService=planetService;
    }

    @GetMapping("/planets")
    public ResponseEntity<List<Planet>> findAll(){

        List<Planet> result = planetService.findAll();
        return ResponseEntity.ok().body(result);
    };

    



}
