package com.example.StarSystemsandPlanetsAPI.repository;

import com.example.StarSystemsandPlanetsAPI.model.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository extends JpaRepository<Planet,Long> {


}
