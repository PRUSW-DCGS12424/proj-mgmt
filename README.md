# SOFTER Project Management

A Java desktop application for managing IT consulting projects, developed as a practical learning project focused on Object-Oriented Programming (OOP), software design principles, unit testing, and Test-Driven Development (TDD).

## 🚀 Project Overview

This application simulates a project management system for SOFTER, a global IT consulting and digital transformation company.

It allows users to manage consulting projects across different industries, such as Finance, Healthcare, and Manufacturing.

The project also serves as a practical environment for learning and applying software testing techniques through the **Red-Green-Refactor** TDD cycle.

## ✨ Features

- **Project Management:** Create, retrieve, update, and delete projects.
- **Project Classification:** Organize projects by industry sector.
- **Project Status Tracking:** Manage project statuses (Proposed, In Progress, Completed, and Cancelled).
- **Budget Management:** Calculate total project budgets by industry sector.
- **MySQL Integration:** Persist project information using a relational database.
- **Desktop Interface:** Interactive graphical user interface built with Java Swing.
- **Unit Testing:** Test business logic using JUnit 5.
- **Mocking:** Isolate application components using Mockito.

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java 21 | Programming language |
| Gradle 9.8.2 | Build automation and dependency management |
| Java Swing | Desktop graphical user interface |
| MySQL | Relational database |
| JUnit 5 | Unit testing framework |
| Mockito | Mocking framework |
| JDBC | Database connectivity |
| IntelliJ IDEA | Development environment |

## 📁 Project Structure

```text
src/
├── main/
│   ├── java/
│   │   └── com/inetum/tdd/project/
│   │       ├── config/       # Database configuration
│   │       ├── model/        # Domain entities and enums
│   │       ├── repository/   # Data access layer
│   │       ├── service/      # Business logic
│   │       ├── ui/           # Swing user interface
│   │       └── MainApplication.java
│   │
│   └── resources/
│       └── application.properties
│
└── test/
    └── java/
        └── com/inetum/tdd/project/
            └── service/     # Unit tests
```

## ⚙️ Getting Started

### Prerequisites

Make sure you have installed:

- JDK 21 or later.
- MySQL Server 8.0 or later.
- IntelliJ IDEA (recommended).

### 1. Clone the repository

```bash
git clone https://github.com/PRUSW-DCGS12424/proj-mgmt.git
```

### 2. Set up the database

Execute the SQL script located in the project root:

```text
schema.sql
```

This script creates the `projects_db` database, the `projects` table, and some sample records.

### 3. Configure database connection

Open:

```text
src/main/resources/application.properties
```

Update the database configuration according to your local MySQL installation:

```properties
db.url=jdbc:mysql://localhost:3306/projects_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
db.username=root
db.password=your_password
```

### 4. Run the application

On Windows:

```bash
gradlew.bat run
```

On Linux or macOS:

```bash
./gradlew run
```

## 🧪 Running Tests

Execute all unit tests using Gradle:

**Windows:**

```bash
gradlew.bat test
```

**Linux / macOS:**

```bash
./gradlew test
```

To generate the test report:

```bash
gradlew.bat test
```

The HTML report will be available at:

```text
build/reports/tests/test/index.html
```

## 🔴🟢🔵 Test-Driven Development

This project is designed to demonstrate the fundamental TDD workflow:

1. **Red:** Write a test that describes the expected behavior and initially fails.
2. **Green:** Implement the minimum code necessary to make the test pass.
3. **Refactor:** Improve the code while keeping all tests passing.

The goal is to develop reliable, maintainable, and testable Java applications.

## 📚 Learning Objectives

- Apply Object-Oriented Programming principles.
- Understand separation of concerns and layered architecture.
- Implement the Repository and Service patterns.
- Practice dependency injection through constructor injection.
- Write unit tests with JUnit 5.
- Isolate dependencies using Mockito.
- Understand and apply the TDD development cycle.
- Improve code quality through continuous refactoring.

## 📄 License

This project is licensed under the [MIT License](LICENSE.txt).

---

**Developed for learning, practicing, and mastering Java software development and Test-Driven Development.**