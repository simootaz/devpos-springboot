# CI/CD Pipeline and Containerized Deployment Project

This project demonstrates the implementation of a CI/CD pipeline integrated with containerization and orchestration to automate the deployment of a Spring Boot application and MySQL database.

---

## Project Overview

The main objective of this project is to showcase:
1. **Containerization** of the application and database using Docker.
2. **Automation** of the build, test, and deployment processes using a CI/CD pipeline in Jenkins.
3. **Orchestration** of services using Docker Compose for seamless integration and deployment.

---

## Features

- **Containerization**:
  - The application is built into a Docker image using a `Dockerfile` based on `openjdk:17-jdk-alpine`.
  - MySQL 5.7 is used as the database, and both services are defined in the `docker-compose.yml`.

- **CI/CD Pipeline**:
  - Clones the source code from the Git repository.
  - Builds the project with Maven.
  - Performs static code analysis using SonarQube.
  - Runs unit tests.
  - Packages the application.
  - Builds a Docker image and pushes it to Docker Hub.
  - Deploys the application using Docker Compose.

---

## CI/CD Pipeline Workflow

The pipeline consists of the following stages:
1. **Checkout Source Code**: Clones the Git repository.
2. **Build and Package**:
   - Maven is used to compile the code, package the application, and run tests.
3. **Code Analysis**: The code quality is analyzed using SonarQube.
4. **Docker Build and Push**:
   - Builds a Docker image of the application.
   - Pushes the image to Docker Hub for centralized storage.
5. **Deployment**:
   - Deploys the application and database using Docker Compose.

---

## Scalability, Reliability, and Performance

- **Scalability**:
  - Docker Compose makes it easy to scale the application by adding more replicas of the service.
  - The database and application containers are isolated, ensuring modular scalability.

- **Reliability**:
  - The CI/CD pipeline ensures that only thoroughly tested code is deployed.
  - Automated steps reduce human error and provide a reliable deployment process.

- **Performance**:
  - By containerizing the application, it benefits from resource isolation and efficient resource utilization.
  - The use of lightweight Docker images enhances performance during deployment and execution.

---

## Prerequisites

- **Jenkins**: Installed and configured with the required plugins.
- **SonarQube**: Set up for code analysis.
- **Docker**: Installed on the host machine to build and run containers.
- **Docker Compose**: For orchestration of services.

---

## How to Run Locally

1. Clone the repository:
   ```bash
   git clone <repository-url>
