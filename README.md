# School and Student Microservices Project

This project consists of two microservices: `School` and `Student`, along with a `Gateway Server` and a `Discovery Server`. The microservices communicate with each other through the gateway.

## Project Structure

- `config-server`: Configuration server for centralized configuration management.
- `discovery-server`: Eureka server for service discovery.
- `gateway-server`: API Gateway for routing requests to the appropriate microservices.
- `school`: Microservice for managing schools.
- `student`: Microservice for managing students.

## Technologies Used

- Java
- Spring Boot
- Spring Cloud (Eureka, Gateway)
- Maven

## Prerequisites

- Java 11 or higher
- Maven
- Postman (for testing APIs)

## Configuration

### Config Server

The `config-server` fetches configurations from the `configurations` directory. Ensure the following files are present:

- `gateway-server.yml`
- `discovery-server.yml`
- `students.yml`
- `schools.yml`

### Discovery Server

The `discovery-server` is configured to run on port `8761` and does not register itself with Eureka.

### Gateway Server

The `gateway-server` is configured to route requests to the `school` and `student` microservices.

### School Microservice

The `school` microservice manages school entities and communicates with the `student` microservice to fetch students for a particular school.

### Student Microservice

The `student` microservice manages student entities and provides endpoints to fetch students by school ID.

