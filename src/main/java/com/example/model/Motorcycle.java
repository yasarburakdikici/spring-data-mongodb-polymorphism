package com.example.model;


import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

//TypeAlias annotation will be look _class field for deserialization.
// If _class:motorcycle json to DTO convert successfully for this DTO.
@TypeAlias("motorcycle")
//MongoMappingContext must know this DTO is part of mongo document.
@Document
public class Motorcycle extends Vehicle {
    private String color;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {this.color = color;}
}
