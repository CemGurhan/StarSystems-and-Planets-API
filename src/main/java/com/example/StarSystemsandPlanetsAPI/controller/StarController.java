package com.example.StarSystemsandPlanetsAPI.controller;

import com.example.StarSystemsandPlanetsAPI.model.Star;
import com.example.StarSystemsandPlanetsAPI.repository.StarRepository;
import com.example.StarSystemsandPlanetsAPI.service.StarService;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Star> findStarByID(@PathVariable("id") int id){
        Star result = starService.findStarByID(id);
        return ResponseEntity.ok().body(result);
    }


    @PostMapping("/stars/addStar")
    public ResponseEntity<Star> addStar(@RequestBody Star star){
        Star result = starService.addStar(star);
        return ResponseEntity.ok().body(result);
    }





}
