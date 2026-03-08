Hotel Management System (Spring Boot)

A Hotel Management System REST API developed using Spring Boot, Spring Data JPA, and Oracle Database.
The system allows hotel administrators to manage rooms and customer bookings efficiently.

This project follows a 3-layer architecture:

Controller Layer – Handles HTTP requests

Service Layer – Contains business logic

Repository Layer – Handles database operations using Spring Data JPA

The application stores data in an Oracle database and exposes REST APIs for managing hotel operations.

Technologies Used

Java

Spring Boot

Spring Data JPA

Maven

Oracle Database

REST API

Postman (for API testing)

Project Structure
com.hotelmanagement
│
├── controller
│     ├── RoomController
│     └── BookingController
│
├── service
│     ├── RoomService
│     └── BookingService
│
├── service.impl
│     ├── RoomServiceImpl
│     └── BookingServiceImpl
│
├── repository
│     ├── RoomRepository
│     └── BookingRepository
│
├── entity
│     ├── Room
│     └── Booking
│
└── HotelManagementApplication

This architecture separates API handling, business logic, and database access for better maintainability.
Database Tables
Room Table
Field	Type	Description
roomId	Number	Primary Key
roomNumber	Varchar	Unique room number
roomType	Varchar	Single / Double / Deluxe
price	Number	Price per day
status	Varchar	Available / Occupied
Booking Table
Field	Type	Description
bookingId	Number	Primary Key
customerName	Varchar	Customer name
customerPhone	Varchar	Phone number
checkInDate	Date	Check-in date
checkOutDate	Date	Check-out date
roomId	Number	Foreign key referencing Room

A Room can have multiple bookings, forming a one-to-many relationship between Room and Booking.

REST API Endpoints
Room APIs
Method	Endpoint	Description
POST	/rooms	Add a new room
GET	/rooms	Get all rooms
GET	/rooms/{id}	Get room by ID
PUT	/rooms/{id}	Update room
DELETE	/rooms/{id}	Delete room
Booking APIs
Method	Endpoint	Description
POST	/bookings	Create booking
GET	/bookings	Get all bookings
GET	/bookings/{id}	Get booking by ID
PUT	/bookings/{id}	Update booking
DELETE	/bookings/{id}	Cancel booking

These APIs allow administrators to manage rooms and bookings through REST endpoints.

Example API Request
Create Room

POST /rooms

{
 "roomNumber": "101",
 "roomType": "Deluxe",
 "price": 2500,
 "status": "Available"
}

Create Booking

POST /bookings

{
 "bookingId": 1,
 "customerName": "Manan",
 "customerPhone": "9876543210",
 "checkinDate": "2026-03-10",
 "checkoutDate": "2026-03-12",
 "room": {
   "roomId": 1
 }
}

How to Run the Project

Clone the repository

git clone https://github.com/yourusername/hotel-management-system.git

Open the project in Eclipse / IntelliJ

Configure Oracle Database connection in application.properties

spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

Run the application

HotelManagementApplication.java

Test APIs using Postman

Base URL:

http://localhost:9090

Features

Manage hotel rooms

Create and manage customer bookings

Track which customer booked which room

Update booking information

Cancel bookings

RESTful API architecture

Oracle database integration

ER Diagram

The system contains two main entities:

Room

Booking

Each Room can have multiple Bookings, represented by a foreign key relationship between the tables.

Author

Manan Jungwal
B.Tech Computer Science Engineering



