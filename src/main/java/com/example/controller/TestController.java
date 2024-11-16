package com.example.controller;

import com.example.model.Garage;
import com.example.service.TestService;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping("/test")
    public Garage garage(@RequestBody Garage garage) {
        return testService.post(garage);
    }

    @GetMapping("/test/{id}")
    public Garage garage(@PathVariable String id) {
        return testService.get(id);
    }
}
