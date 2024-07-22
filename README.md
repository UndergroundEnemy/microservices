# Microservices Repository
This repository contains a collection of independent services that work together to form a robust and scalable system.

## Overview
Our microservices architecture is designed to promote flexibility, scalability, and maintainability. Each service is responsible for a specific business capability and communicates with other services using APIs.

## Services
The following services are currently part of this repository:

1. Identity Service
Responsible for user authentication and authorization
Provides APIs for user registration, login, and validation of jwt token using
io.jsonwebtoken liblraries
3. Experience Service
Responsible for retrieving experience data
Provides APIs for experience creation and retrieval
Built using Java and Spring Boot
4. Industry Service
Responsible for retrieving industry data
Provides APIs for experience creation and retrieval
Built using Java and Spring Boot
5. API gateway Service
Responsible for request distribution for different services
Architecture
Our microservices architecture is designed to be highly available and scalable. Each service is deployed in a separate container and communicates with other services using RESTful APIs.

## Service Communication
Services communicate with each other using RESTful APIs
Service discovery is handled using a registry (Netflix eureka server)

## Contributing
Contributions are welcome! If you'd like to contribute to this repository, please follow these steps:

## Fork the repository
Create a new branch for your feature or fix
Make your changes and commit them
Create a pull request to merge your branch into main

### Acknowledgments
We'd like to thank the following projects and libraries for their contributions to our microservices architecture:

- __Java__
- __Spring Boot__
- __Spring Cloud__
- __Spring Web__
- - __Spring Security__

