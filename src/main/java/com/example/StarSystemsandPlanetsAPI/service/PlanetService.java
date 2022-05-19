package com.example.StarSystemsandPlanetsAPI.service;

import com.example.StarSystemsandPlanetsAPI.model.Planet;
import com.example.StarSystemsandPlanetsAPI.repository.PlanetRepository;
import org.springdoc.api.OpenApiResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Map<String,Boolean> deletePlanetByID(int id){

        try{
            Planet result = planetRepository.findPlanetByID(id);
            planetRepository.delete(result);

        }
        catch (IllegalArgumentException e){
            new Exception("Planet does not exist!");
        }

        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return response;
    }

}
