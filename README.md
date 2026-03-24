# 🍃 Producer Management System (CRUD)

A robust full-stack web application built with **Java 25** and **Spring Boot 4.0.4**. This project manages a database of producers, providing a clean and responsive user interface for inventory control.

---

## 🚀 Features

- **Full CRUD functionality**: Create, Read, and Delete producers directly from the web UI.
- **Dynamic Frontend**: Powered by **Thymeleaf** for server-side rendering.
- **Modern Styling**: Responsive design using **Bootstrap 5**.
- **Interactive Actions**: Integrated JavaScript prompts for a seamless user experience.
- **Secure Configuration**: Database credentials handled via environment variables (no hardcoded passwords).

## 🛠 Tech Stack

- **Backend:** Java 25, Spring Boot 4.0.4, Spring Data JPA.
- **Frontend:** HTML5, JavaScript, Thymeleaf, Bootstrap 5.
- **Database:** MySQL / PostgreSQL (Docker ready).
- **Tooling:** Maven, Lombok, IntelliJ IDEA.

---

## ⚙️ Setup & Installation

### 1. Prerequisites
- **Java 25** installed.
- **Maven** 3.9+ installed.
- A running **MySQL** instance.

### 2. Environment Variables
To keep the application secure, you **must** set the following environment variables in your IDE or system before running:

| Variable | Description | Example |
| :--- | :--- | :--- |
| `DB_USERNAME` | Your database user | `root` |
| `DB_PASSWORD` | Your database password | `your_secret_password` |
| `DB_HOST` | Database host address | `localhost` |

### 3. Running the App
```bash
# Clone the repository
git clone [https://github.com/SeuUsuario/ProjectCrud.git](https://github.com/SeuUsuario/ProjectCrud.git)

# Navigate to the project folder
cd ProjectCrud

# Run the application
mvn spring-boot:run
