package com.homeimprovement.tracker.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name = "Greeting", description = "Greeting endpoints")
public class HelloController {

    @GetMapping("/hello")
    @Operation(summary = "Get greeting message", description = "Returns a friendly greeting from the API")
    @ApiResponse(responseCode = "200", description = "Greeting message retrieved successfully")
    public String hello() {
        return "Hello from Home Improvement Tracker API!";
    }
}
