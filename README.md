# Table-Track
A Restaurant Reservation System

## Problem Definition 
In the modern dining industry, efficient management of reservations is critical for enhancing customer satisfaction and optimizing restaurant operations. Many restaurants still rely on outdated, manual reservation systems that are prone to errors, overbooking, and inefficiencies. These systems often result in frustrated customers due to lost reservations, long wait times, and poor table management. Additionally, restaurant staff spends considerable time managing bookings manually, which detracts from their ability to provide excellent customer service.

Table Track will provide a command-line interface for both customers and restaurant staff to interact with the reservation system. Customers can make reservations, view available time slots, and receive confirmation of their bookings. Restaurant staff will have access to functionalities such as adding, updating, and canceling reservations.

Our main objective is to design and develop robust testing suites for this project. We will employ various testing techniques, including path testing, data flow analysis, logic coverage, integration testing, and validation testing. By thoroughly testing the software application, we aim to ensure its reliability, accuracy, and effectiveness in managing restaurant reservations.

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
- Economic Factors: Our product is free to use 
- Sustainability and Environmental Factors: Our application allows restaurants to save supplies, as all reservations are done online. 
- Societal Impacts: Our application reduces employees' workload and stress, as customers can book their own reservations, without having to speak to an employee.
- Ethics:
- No User Interface : Table Track will be a command-line based software, with no graphical user interface.
- Only employees can upadate the reservation information. Customers are not allowed to change any reservations.

## Solution 1
- Our first solution was a simple solution that only allowed users to enter a time and number of people. The majority of our test cases failed as we only had the users enter minimal information.

## Solution 2
- We refined our design to allow the user to enter all of their information. With this design, the customer test cases passed, however, the employee test cases failed as we had no way for employees to edit information. We also had no way for the user to choose whether they are an employee or a customer. To improve this design, we need to add a code that employees can enter in order to access the edit and delete methods.

## Final Solution
- Our final solution is better than our other two solutions, as the user selects whether they are an employee or a customer. If they are an employee, they are prompted to enter in a code to get access to the employee information. Our final solution includes the customer entering in all of the information needed to book a reservation and allows the customers to view available times, and update their reservation. It also allows the employees to make, view, edit, and delete reservations. This resulted in all of our test cases passing.

### Components
- Customer
- Reservation
- Reservation Manger
- Staff
- Util
- App

### Features
Customer Features:
- Customers can make a reservation by entering in a date, time, number of people, and contact information.
- Customers can view available time slots for specific dates, in order to choose the best available time for them.
- Reservations can be updated with the Reservation ID number that was given to the customer. They can update the date, time or number of people for their reservation.
- Customers can enter in their Reservation ID number and view their reservation information.

Employee Features:
- Employees can make a reservation for a customer by inserting the date, time, number of people and customer information.
- Employees can update a customers reservation.
- Available time slots for dates can be viewed by employees.
- All reservations can be viewed by employees.
- Employees can cancel reservations.

### Environmental, Societal, Safety and Economic Considerations
- Our design took societal constraints into consideration by ensuring that our product would be beneficial for a restaurants' employees and help them lessen their workload. By giving the customer's the ability to make and update their own reservations, employees no longer have to personally accept calls for reservations.
- Our product also took safety constraints into consideration by only allowing employees to make and view changes with a specific code. This ensures that no one except for employees can view and edit reservations.
- We took economic constraints into consideration as our product would be completely free to use for any restaurant.  

### Test Cases and Results
#### Path Testing
- For the addReservation() method in the ReservationManager class, there are two paths that can be taken. The first path is when the requested time slot is available and the second one is when the time slot is not available. These two test cases cover both of these paths.
![image](https://github.com/user-attachments/assets/f93c4f9d-27a2-4301-82da-b3bc15e17bfe)

#### Data Flow

#### Logic Coverage

#### Integration Testing
- The test case 'testUpdateReservation_Valid' in the [Reservation Manager Test] "/TableTrack/tests/ReservationManagerTest.java" file, performs Integration testing, because it tests how the Reservation class and the Reservation Manager class interact with each other

#### Boundary Value Testing

#### Equivalence Class Testing

#### Decision Table Testing
- Decision Table for making a reservation:
![image](https://github.com/user-attachments/assets/571eb9cb-433f-4fc0-af20-13f743f5fedd)

- [Decision Table Test Cases](/TableTrack/tests/UtilTest.java) 

#### State Transition Testing

#### Use Case Testing
- Make a reservation:
![image](https://github.com/user-attachments/assets/1d09640a-bcd4-4268-b805-541fbbeb5f06)

- Update a reservation:
![image](https://github.com/user-attachments/assets/51e07116-dcdc-4a8d-affb-abd8286e9eba)

- Cancel a reservation:
![image](https://github.com/user-attachments/assets/c6c5d6d3-0d71-4d12-8c0d-1abf86764da2)

### Limitations
- Our design is only available through a command-line interface. 
