package com.example.StarSystemsandPlanetsAPI.controller;

import com.example.StarSystemsandPlanetsAPI.model.Planet;
import com.example.StarSystemsandPlanetsAPI.service.PlanetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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

    @GetMapping("/planets/{id}")
    public ResponseEntity<Planet> findPlanetByID(@PathVariable("id") int id){
        Planet result = planetService.findPlanetByID(id);
        return ResponseEntity.ok().body(result);
    }


    @DeleteMapping("/planetDelete/{id}")
    public Map<String,Boolean> deletePlanetByID(@PathVariable("id") int id){        //what if planet doesnt exist

        return planetService.deletePlanetByID(id);

    }

    @PutMapping("updatePlanet/{id}")
    public Planet updatePlanetByID(@RequestParam(required = false) String name,
                                   @RequestParam(required = false) String type,
                                   @PathVariable("id") int id){

        return planetService.updatePlanetById(id,name,type);

    }



    }



