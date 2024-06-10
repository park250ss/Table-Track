# Table-Track
A Restaurant Reservation System

## Problem Definition 
In the modern dining industry, efficient management of reservations is critical for enhancing customer satisfaction and optimizing restaurant operations. Many restaurants still rely on outdated, manual reservation systems that are prone to errors, overbooking, and inefficiencies. These systems often result in frustrated customers due to lost reservations, long wait times, and poor table management. Additionally, restaurant staff spends considerable time managing bookings manually, which detracts from their ability to provide excellent customer service.

Table Track will provide a command-line interface for both customers and restaurant staff to interact with the reservation system. Customers can make reservations, view available time slots, and receive confirmation of their bookings. Restaurant staff will have access to functionalities such as adding, updating, and canceling reservations.

Our main objective is to design and develop robust testing suites for this projectadd some const. We will employ various testing techniques, including path testing, data flow analysis, logic coverage, integration testing, and validation testing. By thoroughly testing the software application, we aim to ensure its reliability, accuracy, and effectiveness in managing restaurant reservations.

## Design Requirements

### Functions
Customer:
- View available reservation times
- Select an available time and number of people for a table
- Enter name and contact information
- Confirm reservation

Restaurant Staff:
- Update number of people in a reservation
- Update time of a reservation
- Cancel a reservation

### Objectives
- Customers can make reservations
- Restaurant staff can update and cancel reservatiosn

### Constraints
- No User Interface : Table Track will be a command-line based software, with no graphical user interface.
- Only employees can upadate the reservation information. Customers are not allowed to change any reservations.
