package com.example.StarSystemsandPlanetsAPI;

import com.example.StarSystemsandPlanetsAPI.model.Planet;
import com.example.StarSystemsandPlanetsAPI.model.Star;
import com.example.StarSystemsandPlanetsAPI.service.PlanetService;
import com.example.StarSystemsandPlanetsAPI.service.StarService;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StarSystemsAndPlanetsApiApplicationTests {

	@Autowired
	private StarService starService;

	@Autowired
	private PlanetService planetService;

	@Test
	void contextLoads() {
	}

	@Test
	void getStarByIDTest(){

		String starName = starService.findStarByID(2).getName();

		assertEquals(starName,"Kepler-16B");
	}

	@Test
	void getAllStarsTest(){
		List<Star> testStars = starService.findAll();

		assertEquals(testStars.isEmpty(),false);
	}

	@Test
	void getAllPlanetsTest(){
		List<Planet> testPlanets = planetService.findAll();

		assertEquals(testPlanets.isEmpty(),false);
	}

	@Test
	void getPlanetByIDTest(){
		Planet testPlanet = planetService.findPlanetByID(3);
		assertEquals(testPlanet.getName(),"Venus");
	}

}
