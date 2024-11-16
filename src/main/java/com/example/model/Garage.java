package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("garage")
public class Garage {
    @Id
    private String id;

    @JsonProperty("vehicle")
    private List<? extends Vehicle> vehicle;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<? extends Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(List<? extends Vehicle> vehicle) {
        this.vehicle = vehicle;
    }
}
