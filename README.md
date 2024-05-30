# Spring Pet Clinic Web App

## Overview
The Spring Pet Clinic is a web application designed to manage the operations of a pet clinic. It allows for the management of pets, their owners, and veterinary visits, providing an intuitive interface for clinic staff to track and update pet records.

## Technology Stack
- **Backend:** Spring Boot
- **Frontend:** Thymeleaf, LESS, Bootstrap
- **Database:** H2
- **Build Tool:** Maven
- **CI/CD:** CircleCI
- **Version Control:** Git

## Architecture
The system follows a layered architecture with the following components:
- **Controller Layer:** Handles HTTP requests and maps them to service methods.
- **Service Layer:** Contains the business logic.
- **Repository Layer:** Manages data access using Spring Data JPA.

## Key Features
- **Pet Management:** CRUD operations for pets.
- **Owner Management:** CRUD operations for pet owners.
- **Visit Management:** Schedule and manage veterinary visits.
- **Veterinarian Management:** Manage veterinarians and their specialties.

## Spring Specific Features
- **Dependency Injection:** Managed by Spring’s IoC container.
- **Spring Data JPA:** Simplifies database operations with repository interfaces.
- **Project Lombok:** provides annotations to generate getters, setters, constructors, toString, equals, hashCode, and other commonly used methods, reducing the need for boilerplate code.
- **Spring Boot:** Facilitates quick setup and development with minimal configuration.

## Database Design
#### Entities and Relationships
- **Owner**
- **Pet**
- **Person**
- **PetType**
- **Speciality**
- **Vet**
- **Visit**

## Configuration and Setup
#### Application Properties
```properties
spring.profiles.active=springDataJpa // add to switch from Map<> to JPA
```

## Testing
- **Unit Tests:** Using JUnit and Mockito for testing services and controllers.
- **Integration Tests:** Testing the interaction between different layers.
- **CI with CircleCI:** The project is configured to use CircleCI for continuous integration.
