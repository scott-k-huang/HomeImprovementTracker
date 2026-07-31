package com.homeimprovement.tracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Home Improvement Tracker API!";
    }

    @GetMapping("/health")
    public String health() {
        return "API is running successfully";
    }
}
