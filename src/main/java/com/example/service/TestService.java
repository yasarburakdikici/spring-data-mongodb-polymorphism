package com.example.service;

import com.example.model.Garage;

public interface TestService {
    Garage post(Garage garage);
    Garage get(String id);
}
