package com.example.StarSystemsandPlanetsAPI.service;

import com.example.StarSystemsandPlanetsAPI.model.Star;
import com.example.StarSystemsandPlanetsAPI.repository.StarRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Transactional
    public Star addStar(Star star){

        return starRepository.save(star);
    }

}
