package com.example.service;

import com.example.model.Garage;
import com.example.repository.TestRepository;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public Garage post(Garage garage) {
        return testRepository.save(garage);
    }

    @Override
    public Garage get(String id) {
        return testRepository.findById(id).orElse(null);
    }
}
