package com.example.StarSystemsandPlanetsAPI.repository;

import com.example.StarSystemsandPlanetsAPI.model.Star;
import com.example.StarSystemsandPlanetsAPI.model.StarSystemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StarRepository extends JpaRepository<Star,Long> {

    @Query(value = "SELECT stars.id AS id, stars.constellation,stars.name AS star_name," +
            "stars.solar_mass AS star_solar_mass,stars.type AS star_type," +
            "planets.name AS orbiting_planet_name,planets.type AS orbiting_planet_type " +
            "FROM stars INNER JOIN system ON stars.id=system.stars_id " +
            "INNER JOIN planets ON planets.id=system.planets_id WHERE stars.id = 3 ;",nativeQuery = true)
    Star returnSystem();

    @Query(value = "SELECT * FROM stars WHERE id = ?",nativeQuery = true)
    Star findStarByID(int id);



}
