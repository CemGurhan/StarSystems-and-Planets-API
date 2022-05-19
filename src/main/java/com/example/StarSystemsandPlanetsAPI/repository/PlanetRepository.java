package com.example.StarSystemsandPlanetsAPI.repository;

import com.example.StarSystemsandPlanetsAPI.model.Planet;
import org.hibernate.mapping.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PlanetRepository extends JpaRepository<Planet,Long> {

    @Query(value = "SELECT * FROM planets WHERE id = ?", nativeQuery = true)
    Planet findPlanetByID(int id);


}
