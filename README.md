Travel Bharat – Explore India State by State
An advanced full-stack tourism discovery platform starter project.
Stack
Frontend: HTML5, CSS3, Vanilla JavaScript
Backend: Java 17+, Spring Boot 3, Spring Data JPA, Spring Security-ready
Database: MySQL 8
API style: REST / JSON
Project structure
travel-bharat/
├── frontend/
│   ├── index.html
│   ├── styles.css
│   └── app.js
├── backend/
│   ├── pom.xml
│   └── src/main/
│       ├── java/com/travelbharat/
│       │   ├── TravelBharatApplication.java
│       │   ├── destination/Destination.java
│       │   ├── destination/DestinationRepository.java
│       │   └── destination/DestinationController.java
│       └── resources/application.properties
└── documentation/
    ├── PROJECT_REPORT.md
    └── API_GUIDE.md
Run the frontend
Open frontend/index.html in a browser. It includes demo destination data and works without the backend.
Run the backend
Install JDK 17+ and Maven.
Create a MySQL database:
CREATE DATABASE travel_bharat;
Update the username/password in backend/src/main/resources/application.properties.
From the backend directory, run:
mvn spring-boot:run
API base URL: http://localhost:8080/api
API
GET /api/destinations – list destinations
GET /api/destinations/{id} – get one destination
GET /api/destinations/search?keyword=fort – search by name, state or category
GET /api/destinations/state/{stateName} – filter by state
Next development milestones
Add registration/login and role-based authorization.
Add itinerary CRUD endpoints and user ownership.
Add reviews, moderation and rating aggregation.
Add admin CRUD, image upload and content validation.
Add pagination, caching, automated tests and deployment.
The included backend is a clean, runnable API foundation; the frontend currently uses local demo data so it can be previewed immediately.
