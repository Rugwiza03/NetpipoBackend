# Netpipo Backend - Employee Management API

## Overview

The Netpipo Backend is a RESTful API for managing employees within a company. This project is designed to showcase Object-Oriented Programming (OOP) principles, authentication, error handling, and database management.

## Features

- Employee CRUD (Create, Read, Update, Delete) operations
- JWT Authentication and Authorization
- PostgreSQL/MySQL database integration
- Error handling with meaningful HTTP status codes
- Unit tests for core functionalities
- API documentation using Swagger/Postman (Bonus)
- Deployment to a cloud platform (Bonus)

## Technologies Used

- **Java 17+**
- **Spring Boot** (Backend Framework)
- **Spring Security & JWT** (Authentication & Authorization)
- **PostgreSQL/MySQL** (Database Management)
- **JUnit & Mockito** (Testing)
- **Swagger/Postman** (API Documentation)

## Setup Instructions

### Prerequisites

Ensure you have the following installed:

- [Java 17+](https://adoptopenjdk.net/)
- [Maven](https://maven.apache.org/download.cgi)
- [PostgreSQL/MySQL](https://www.postgresql.org/download/)
- [Git](https://git-scm.com/downloads)

### Installation Steps

1. **Clone the Repository**

   ```sh
   git clone https://github.com/YOUR_GITHUB_USERNAME/NetpipoBackend.git
   cd NetpipoBackend
   ```

2. **Configure Database**

   - Update `application.properties` with your database credentials.

3. **Build and Run the Application**

   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

4. **Access API Endpoints**

   - Base URL: `http://localhost:8080`
   - API documentation (if Swagger is enabled): `http://localhost:8080/swagger-ui.html`

## API Endpoints

| Method | Endpoint          | Description                        |
| ------ | ----------------- | ---------------------------------- |
| POST   | `/employees/`     | Create a new employee              |
| GET    | `/employees/`     | Get a list of all employees        |
| GET    | `/employees/{id}` | Get details of a specific employee |
| PUT    | `/employees/{id}` | Update an employee’s details       |
| DELETE | `/employees/{id}` | Delete an employee                 |

## Authentication

- The API uses **JWT-based authentication**.
- Only authenticated users can perform POST, PUT, and DELETE operations.
- Token-based authentication mechanism will be detailed later.

## Testing

Run unit tests using:

```sh
mvn test
```

## Contribution

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-name`).
3. Commit your changes (`git commit -m 'Add feature'`).
4. Push to the branch (`git push origin feature-name`).
5. Open a Pull Request.

## Deployment (Bonus)

Deploy the API to a cloud platform like **DigitalOcean, Render, or Railway** for additional points.

## License

This project is for evaluation purposes only.

---

**Author:** Ndayishimiye Adolphe
**GitHub Repository:** [NetpipoBackend](https://github.com/Rugwiza03/NetpipoBackend.git)

 

