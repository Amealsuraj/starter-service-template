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

##Run App locally
Using Windows Command Prompt
gradlew.bat bootRun --args="--spring.profiles.active=dev"

## How to Run Using IDE (Eclipse / STS)

### 1) Import the Project
1. Open **Eclipse / Spring Tool Suite (STS)**
2. Go to: **File → Import**
3. Select: **Gradle → Existing Gradle Project**
4. Click **Next**
5. Browse and select the project directory:
6. Click **Finish**

Wait for Gradle dependencies to download.

---

### 2) Refresh Gradle Dependencies
After importing:
- Right click project → **Gradle → Refresh Gradle Project**

---

### 3) Run the Application
1. Open:
`src/main/java/com/sugarfit/starter/StarterServiceTemplateApplication.java`
2. Right click → **Run As**
3. Select:
- **Spring Boot App** (recommended)
- OR **Java Application**

The application will start on:
http://localhost:8080
---

### 4) Run with Profiles (dev / qa / prod)
1. Right click project → **Run As → Run Configurations**
2. Select **Spring Boot App**
3. Go to the **Arguments** tab
4. Add one of the following in **Program arguments**:

**Dev**
--spring.profiles.active=dev

**QA**
--spring.profiles.active=qa

**Prod**
--spring.profiles.active=prod


Click **Apply → Run**

---

### 5) Run Tests in Eclipse / STS
- Right click project → **Run As → JUnit Test**
- Or right click any test class → **Run As → JUnit Test**



## Swagger API Docs
- Swagger UI: http://localhost:8080/swagger-ui/index.html
- OpenAPI JSON: http://localhost:8080/v3/api-docs


### 1) Prerequisites
- Java 21 installed

### 2) Run the service
```bash
./gradlew clean build
./gradlew bootRun
