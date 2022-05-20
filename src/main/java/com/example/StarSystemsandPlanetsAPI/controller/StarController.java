package com.example.StarSystemsandPlanetsAPI.controller;

import com.example.StarSystemsandPlanetsAPI.model.Star;
import com.example.StarSystemsandPlanetsAPI.model.StarSystemModel;
import com.example.StarSystemsandPlanetsAPI.repository.StarRepository;
import com.example.StarSystemsandPlanetsAPI.service.StarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class StarController {

    private StarService starService;

    public StarController(StarService starService){

        this.starService = starService;
    }

    @GetMapping("/stars")
    public ResponseEntity<List<Star>> findAll(){

        List<Star> result = starService.findAll();
        return ResponseEntity.ok().body(result);
    }

    @GetMapping(value = "/stars/{id}")
    public ResponseEntity<Star> findStarByID(@PathVariable("id") int id){
        Star result = starService.findStarByID(id);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping(value = "/stars/system")
    public ResponseEntity<Star> returnSystem(){
        Star result = starService.returnSystem();
        return ResponseEntity.ok().body(result);
    }

//    @PostMapping("/stars/addStar")
//    public ResponseEntity<Star> addStar(@RequestBody Star star){
//        Star result = starService.addStar(star);
//        return ResponseEntity.ok().body(result);
//    }


    @PostMapping("/stars/addStar/{id}")
    public String addStar(@RequestParam String constellation,
                                        @RequestParam String name,
                                        @RequestParam Integer solarMass,
                                        @RequestParam String type,
                                        @PathVariable("id") int id){

       starService.addStar(id,constellation,name,solarMass, type);
        return "added";
    }



    @DeleteMapping("starDelete/{id}")
    public Map<String,Boolean> deleteStarByID(@PathVariable("id") int id){
        return starService.deleteStarByID(id);
    }

    @PutMapping("updateStar/{id}")
    public Star updateStar(@RequestParam(required = false) String constellation,
                           @RequestParam(required = false) String name,
                           @RequestParam(required = false) Integer solarMass,
                           @RequestParam(required = false) String type,
                           @PathVariable("id") int id){

        return starService.updateStarByID(id,constellation,name,solarMass,type);

    }







}
