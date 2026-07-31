package com.homeimprovement.tracker.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI homeImprovementTrackerOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Home Improvement Tracker API")
                        .description("Spring Boot REST API for tracking home improvement projects")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Home Improvement Tracker Team")
                                .email("support@homeimprovementtracker.com")));
    }
}
