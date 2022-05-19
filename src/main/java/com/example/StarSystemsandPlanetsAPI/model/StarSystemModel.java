package com.example.StarSystemsandPlanetsAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StarSystemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String constellation;
    private String star_name;
    private double star_solar_mass;
    private String star_type;
    private String orbiting_planet_name;
    private String orbiting_planet_type;




    public StarSystemModel() {
    }

    public StarSystemModel(Long id,String constellation, String star_name, double star_solar_mass, String star_type, String orbiting_planet_name, String orbiting_planet_type) {
        this.id = id;
        this.constellation = constellation;
        this.star_name = star_name;
        this.star_solar_mass = star_solar_mass;
        this.star_type = star_type;
        this.orbiting_planet_name = orbiting_planet_name;
        this.orbiting_planet_type = orbiting_planet_type;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getStar_name() {
        return star_name;
    }

    public void setStar_name(String star_name) {
        this.star_name = star_name;
    }

    public double getStar_solar_mass() {
        return star_solar_mass;
    }

    public void setStar_solar_mass(double star_solar_mass) {
        this.star_solar_mass = star_solar_mass;
    }

    public String getStar_type() {
        return star_type;
    }

    public void setStar_type(String star_type) {
        this.star_type = star_type;
    }

    public String getOrbiting_planet_name() {
        return orbiting_planet_name;
    }

    public void setOrbiting_planet_name(String orbiting_planet_name) {
        this.orbiting_planet_name = orbiting_planet_name;
    }

    public String getOrbiting_planet_type() {
        return orbiting_planet_type;
    }

    public void setOrbiting_planet_type(String orbiting_planet_type) {
        this.orbiting_planet_type = orbiting_planet_type;
    }
}
