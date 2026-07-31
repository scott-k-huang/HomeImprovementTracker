# Home Improvement Tracker

A Spring Boot REST API for tracking home improvement projects.

## Prerequisites
- Java 17 or higher
- Maven 3.6 or higher

## Running the Application

### Using Maven (default profile)
```bash
mvn spring-boot:run
```

### Using Maven with dev profile (PostgreSQL)
```bash
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

### Using Maven with test profile (PostgreSQL)
```bash
mvn spring-boot:run -Dspring-boot.run.profiles=test
```

### Using Maven with prod profile (PostgreSQL)
```bash
mvn spring-boot:run -Dspring-boot.run.profiles=prod
```

### Using Maven package
```bash
mvn clean package
java -jar target/home-improvement-tracker-1.0.0.jar
```

### Using Maven package with specific profile
```bash
mvn clean package
java -jar target/home-improvement-tracker-1.0.0.jar --spring.profiles.active=dev
```

## API Endpoints

- `GET /api/hello` - Returns a greeting message

## Actuator Endpoints

Spring Boot Actuator provides health and monitoring endpoints:
- `GET /actuator/health` - Health check endpoint (includes dependency health checks)
- `GET /actuator/info` - Application information

Actuator endpoints are available in dev, test, and prod profiles.

## Swagger Documentation

Swagger UI is available at: http://localhost:8080/swagger-ui.html
OpenAPI spec (JSON) is available at: http://localhost:8080/v3/api-docs

**Note:** Swagger UI is only available when running with dev or test profiles. It is disabled in default and prod profiles for security.

## Profiles

### Default Profile
No database configured. Use this profile for simple API testing without database dependencies. Swagger UI and actuator endpoints are disabled.

### Dev Profile
Uses PostgreSQL database with full actuator endpoints and Swagger UI enabled. Ensure PostgreSQL is running locally with:
- Database: `homeimprovementtracker`
- Schema: `homeimprovementtracker`
- Username: `hituser`
- Password: `hituser`
- Port: `5432`

### Test Profile
Uses PostgreSQL database with limited actuator endpoints and Swagger UI enabled. Database schema is created/dropped on startup. Ensure PostgreSQL is running locally with:
- Database: `homeimprovementtracker_test`
- Schema: `homeimprovementtracker`
- Username: `hituser`
- Password: `hituser`
- Port: `5432`

### Prod Profile
Uses PostgreSQL database with limited actuator endpoints and Swagger UI disabled for security. Database schema is validated on startup. Configure with your production database settings:
- Database: `homeimprovementtracker_prod`
- Schema: `homeimprovementtracker`
- Username: `hituser`
- Password: `hituser`
- Port: `5432`

## Project Structure
```
src/
├── main/
│   ├── java/com/homeimprovement/tracker/
│   │   ├── HomeImprovementTrackerApplication.java
│   │   └── controller/
│   │       └── HelloController.java
│   └── resources/
│       └── application.properties
```