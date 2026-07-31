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

### Using Maven package
```bash
mvn clean package
java -jar target/home-improvement-tracker-1.0.0.jar
```

### Using Maven package with dev profile
```bash
mvn clean package
java -jar target/home-improvement-tracker-1.0.0.jar --spring.profiles.active=dev
```

## API Endpoints

- `GET /api/hello` - Returns a greeting message
- `GET /api/health` - Health check endpoint

## Profiles

### Default Profile
Uses H2 in-memory database (no external database required).

### Dev Profile
Uses PostgreSQL database. Ensure PostgreSQL is running locally with:
- Database: `homeimprovementtracker`
- Username: `hitadmin`
- Password: `hitadmin`
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