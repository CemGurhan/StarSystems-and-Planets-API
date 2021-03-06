package com.example.StarSystemsandPlanetsAPI.repository;

import com.example.StarSystemsandPlanetsAPI.model.Planet;
import org.hibernate.mapping.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface PlanetRepository extends JpaRepository<Planet,Long> {

    @Query(value = "SELECT * FROM planets WHERE id = ?", nativeQuery = true)
    Planet findPlanetByID(int id);

//    @Query(value = "DELETE FROM system WHERE planets_id = ?",nativeQuery = true)
//    int deletePlanetByID(int id);

    @Query(value = "INSERT INTO planets (id,name,type) VALUES ( ?1 , ?2 , ?3 )", nativeQuery = true)
    Map<String,Boolean> addPlanet(int id, String name, String type);

}
