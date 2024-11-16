package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.data.mongodb.core.mapping.Field;

// request deserialization for vehicle type (from @type(car,motorcycle) field value).
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type", visible = true)
//car or motorcycle type will be use in runtime because vehicle is abstract can not be create instance.
@JsonSubTypes ({@JsonSubTypes.Type(value = Car.class, name = "car"),
        @JsonSubTypes.Type(value = Motorcycle.class, name = "motorcycle")})
public abstract class Vehicle {
    @JsonProperty("@type")
    @Field("@type")
    private String type;

    @JsonProperty("@baseType")
    //if your field name must be change for mongo serialization or deserialization
    // like baseType (@baseType), you must use Field annotation for MongoMappingContext in runtime.
    @Field("@baseType")
    private String baseType;

    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}