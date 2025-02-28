Multi-Database Support in Spring Boot (PostgreSQL)

📌 Overview

This project demonstrates how to configure and use multiple PostgreSQL databases within a single Spring Boot application using Gradle. It covers setting up different data sources, entity managers, and repositories to handle multiple databases seamlessly.

🛠️ Tech Stack

Java 21

Spring Boot

Spring Data JPA

PostgreSQL

Gradle

⚙️ Setup Instructions

Clone the repository:

git clone <repository-url>
cd <project-folder>

Configure database details in application.yml.

Run PostgreSQL using Docker or a local setup.

Build and run the project:

./gradlew build
./gradlew bootRun

📖 Project Structure

config/: Database configurations

entity/: Entity classes

repository/: Repository interfaces

service/: Business logic

controller/: API endpoints

📝 API Endpoints

GET /api/v1/users - Fetch data from primary DB

GET /api/v1/attendances - Fetch data from secondary DB

📜 License

Licensed under MIT License.

Author: kimvykz
📧 Contact: kimslavakz@gmail.com