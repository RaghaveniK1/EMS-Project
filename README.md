# 🧑‍💼 Employee Management System (EMS)

A backend project built with **Java** and **Spring Boot** that manages employee records with secure **JWT-based authentication**. This system allows you to perform full **CRUD operations** on employees and integrates with an **Oracle Database** for persistence.

---

## 🚀 Features

- ✅ Register and Login with JWT Authentication
- 📋 Create, Read, Update, Delete (CRUD) employees
- 🔎 Search employee by ID
- 🛡 Secure endpoints using Spring Security and JWT
- 💾 Oracle DB integration
- 📦 RESTful API design

---

## 🛠 Tech Stack

| Layer         | Technology            |
|---------------|------------------------|
| Language      | Java                   |
| Framework     | Spring Boot            |
| Security      | Spring Security + JWT  |
| Database      | Oracle DB              |
| Build Tool    | Maven                  |
| IDE           | Eclipse                |

---

### 📁 Project Structure
```
EMS-Project/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo/
│   │   │       ├── controller/         # REST API controllers
│   │   │       ├── dto/                # Data Transfer Objects (optional)
│   │   │       ├── model/              # Entity classes (e.g., Employee.java)
│   │   │       ├── repository/         # Spring Data JPA repositories
│   │   │       ├── security/           # JWT and security configurations
│   │   │       └── service/            # Business logic (service layer)
│   │   └── resources/
│   │       ├── application.properties  # Application configuration
│   │       └── ...                     # Other resources (e.g., static, templates)
│   └── test/
│       └── java/com/example/demo/     # Unit and integration tests
├── .gitignore
├── README.md
├── pom.xml                            # Maven configuration file
└── RealTimeProjectApplication.java    # Spring Boot main application class
```



