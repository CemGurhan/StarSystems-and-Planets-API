package com.example.StarSystemsandPlanetsAPI;

import com.example.StarSystemsandPlanetsAPI.service.StarService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StarSystemsAndPlanetsApiApplicationTests {

	@Autowired
	private StarService starService;

	@Test
	void contextLoads() {
	}

	@Test
	void getStarByIDTest(){

		String starName = starService.findStarByID(2).getName();

		assertEquals(starName,"Kepler-16B");
	}

}
