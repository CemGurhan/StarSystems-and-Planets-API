package com.example.StarSystemsandPlanetsAPI.service;

import com.example.StarSystemsandPlanetsAPI.model.Star;
import com.example.StarSystemsandPlanetsAPI.model.StarSystemModel;
import com.example.StarSystemsandPlanetsAPI.repository.StarRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StarService {

    private StarRepository starRepository;

    public StarService(StarRepository starRepository){
        this.starRepository = starRepository;

    }

    public List<Star> findAll(){
        return starRepository.findAll();
    }

    public Star findStarByID(int id){
        return starRepository.findStarByID(id);
    }

    public Star returnSystem(){return starRepository.returnSystem();}


    public Star addStar(Star star){

        return starRepository.save(star);
    }

    public Map<String,Boolean> deleteStarByID(int id){

        try{
            Star result = starRepository.findStarByID(id);
            starRepository.delete(result);
        }catch(IllegalArgumentException e){
            new Exception("Planet does not exist!");
        }

        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return response;
    }

    public Star updateStarByID(int id,String constellation,String name,int solarMass,String type){
        Star starToUpdate = starRepository.findStarByID(id);

        starToUpdate.setConstellation(constellation);
        starToUpdate.setName(name);
        starToUpdate.setSolarMass(solarMass);
        starToUpdate.setType(type);

        starRepository.save(starToUpdate);

        return  starToUpdate;

    }

}
