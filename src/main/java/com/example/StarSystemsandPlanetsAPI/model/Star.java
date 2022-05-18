package com.example.StarSystemsandPlanetsAPI.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="stars")
public class Star {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private String constellation;
    private int solarMass;

    @ManyToMany(cascade = CascadeType.REMOVE)
    @JoinTable(
            name="System",
            joinColumns = @JoinColumn(name = "stars_id"),
            inverseJoinColumns = @JoinColumn(name="planets_id") // get id from inverse entity in relationship (planets)
    )
    private List<Planet> planets;

    public Star(){}

    public Star(Long id, String name, String type, String constellation, int solarMass) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.constellation = constellation;
        this.solarMass = solarMass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public int getSolarMass() {
        return solarMass;
    }

    public void setSolarMass(int solarMass) {
        this.solarMass = solarMass;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }
}