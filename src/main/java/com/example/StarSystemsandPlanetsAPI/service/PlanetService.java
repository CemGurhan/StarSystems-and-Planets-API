package com.example.StarSystemsandPlanetsAPI.service;

import com.example.StarSystemsandPlanetsAPI.model.Planet;
import com.example.StarSystemsandPlanetsAPI.repository.PlanetRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class PlanetService {

    private PlanetRepository planetRepository;

    public PlanetService(PlanetRepository planetRepository){
        this.planetRepository = planetRepository;
    }

    public List<Planet> findAll(){
        return planetRepository.findAll();
    }

    public Planet findPlanetByID(int id){
        return planetRepository.findPlanetByID(id);
    }



}
