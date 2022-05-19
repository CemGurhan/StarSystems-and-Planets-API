package com.example.StarSystemsandPlanetsAPI.controller;

import com.example.StarSystemsandPlanetsAPI.model.Star;
import com.example.StarSystemsandPlanetsAPI.repository.StarRepository;
import com.example.StarSystemsandPlanetsAPI.service.StarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StarController {

    private StarService starService;

    public StarController(StarService starService){

        this.starService = starService;
    }

    @GetMapping("/stars")
    public List<Star> findAll(){
        return starService.findAll();
    }

    @GetMapping(value = "/stars/{id}")
    public Star findStarByID(@PathVariable("id") int id){
        return starService.findStarByID(id);
    }




    @PostMapping("/addStar")
    public Star addStar(@RequestBody Star star){
        return starService.addStar(star);
    }





}
