# Starter Service Template (Spring Boot)

This project is a production-ready **Spring Boot starter service template** intended to serve as a base for future backend services.

It includes:
- Clean package structure
- Controller → Service separation
- Request validation
- Global exception handling
- Basic tests
- Spring Boot Actuator for operational readiness

---

## Tech Stack
- Java 21
- Spring Boot 3
- Gradle
- JUnit 5

---


## Swagger API Docs
- Swagger UI: http://localhost:8080/swagger-ui/index.html
- OpenAPI JSON: http://localhost:8080/v3/api-docs


### 1) Prerequisites
- Java 21 installed

### 2) Run the service
```bash
./gradlew clean build
./gradlew bootRun
