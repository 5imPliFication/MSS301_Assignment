# MSS301_Assignment

## Assignment 01 for MSS301 - Car Rental
Management System using API Gateway

1. Introduction
A Car Rental Management System is a software solution that helps car rental companies manage
and streamline their business operations. It provides an end-to-end platform to handle various
aspects of the car rental process, from booking and reservation management to vehicle
maintenance, invoicing, and customer relationship management. Here are some key components
and functions of a Car Rental Management System:
- Online Booking and Reservation: The system allows customers to make bookings and
reservations online through a user-friendly interface. It provides real-time availability of
vehicles, rental rates, and booking confirmations.
- Vehicle/Car Management: The system keeps track of the available fleet of vehicles,
including their models, make, year, mileage, and condition. It helps manage vehicle
allocation, availability, and scheduling.
- Customer Management: The system maintains a database of customer information,
including contact details, identification documents, and rental history. It enables easy
retrieval of customer records, communication, and personalized service.
Imagine you&#39;re a developer of a FU Car Renting Management System named
FUCarRentingSystem. To implement a part of this system your tasks include:
- Manage customer information.
- Manage car information.
- Manage car renting transaction.

The architecture will consist of three primary microservices and one API Gateway.
1. Customer Service: This service handles all operations related to customer data. It will
manage creating, retrieving, updating, and deleting customer profiles.
2. Car Service: This service is responsible for managing the vehicle fleet. It will handle
adding new cars, updating vehicle information (e.g., mileage, status), and providing lists
of available cars.
3. Renting Service: This service manages the core business logic of car rentals. It processes
new rental transactions, tracks rental periods, and maintains a history of all rentals.
The API Gateway sits in front of these services. It receives all incoming requests from the
client, authenticates them, and then routes them to the appropriate internal microservice. This
decouples the client from the individual services, simplifying client-side logic and enhancing
security.
