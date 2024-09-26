
# Table-Track
ENSE 375 Software Testing and Validation


## Team Members
Sophia Pasha <br />
Raman Singh <br />
Seonyu Park <br />


## Table of Contents
1. [Introduction](#introduction) <br />
2. [Design Problem](#design-problem) <br />
   2.1 [Problem Definition](#problem-definition) <br />
   2.2 [Design Requirements](#design-requirements) <br />
   - 2.2.1 [Functions](#functions) <br />
   - 2.2.2 [Objectives](#objectives) <br />
   - 2.2.3 [Constraints](#constraints) <br />
3. [Solution](#solution) <br />
   3.1 [Solution 1](#solution-1) <br />
   3.2 [Solution 2](#solution-2) <br />
   3.3 [Final Solution](#final-solution) <br />
   - 3.3.1 [Components](#components) <br />
   - 3.3.2 [Features](#features) <br />
   - 3.3.3 [Environmental, Societal, Safety and Economic Considerations](#environmental,-societal,-safety-and-economic-considerations) <br />
4. [Test Cases and Results](#test-cases-and-results) <br />
5. [Team Work](#team-work)  <br />
6. [Project Management](#project-management)  <br />
7. [Conclusion and Future Work](#conclusion-and-future-work)  <br />

  




## List of Figures
Figure 1: Path Testing <br />
Figure 2: State Transition Testing Diagram <br />
Figure 3: Gantt Chart <br />



## List of Tables
Table 1: Comparison of Solutions <br />
Table 2: Integration Testing  <br />
Table 3: Boundary Value Testing <br />
Table 4: Equivalence Class Testing <br />
Table 5: State Transition Testing Table <br />
Table 6: State Transition Testing Results <br />
Table 7: Decision Table Testing <br />
Table 8: Week 1 Meeting <br />
Table 9: Week 2 Meeting <br />
Table 10: Week 3 Meeting <br />
Table 11: Week 4 Meeting <br />
Table 12: Week 5 Meeting <br />
Table 13: Week 6 Meeting <br />
Table 14: Week 7 Meeting <br />
Table 15: Week 8 Meeting <br />
Table 16: Week 9 Meeting <br />
Table 17: Week 10 Meeting <br />
Table 18: Week 11 Meeting <br />
Table 19: Week 12 Meeting <br />
 

### Introduction 
> <br />
> In the modern dining industry, efficient management of reservations is critical for enhancing customer satisfaction and optimizing restaurant operations. Many restaurants still rely on outdated, manual reservation systems that are prone to errors, overbooking, and inefficiencies. These systems often result in frustrated customers due to lost reservations, long wait times, and poor table management. Additionally, restaurant staff spends considerable time managing bookings manually, which detracts from their ability to provide excellent customer service.<br />
>
> 
### Design Problem
#### Problem Definition 
> <br />
> Table Track will provide a command-line interface for both customers and restaurant staff to interact with the reservation system. Customers can make reservations, view available time slots, and receive confirmation of their bookings. Restaurant staff will have access to functionalities such as adding, updating, and canceling reservations.
> Our main objective is to design and develop robust testing suites for this project. We will employ various testing techniques, including path testing, data flow analysis, logic coverage, integration testing, and validation testing. By thoroughly testing the software application, we aim to ensure its reliability, accuracy, and effectiveness in managing restaurant reservations.<br />

#### Design Requirements 
> <br />
> ##### Functions 
> <br />
> 1. Customor:<br />
> - View available reservation times
> - Select an available time and number of people for a table
> - Enter name and contact information
> - Confirm reservation
> <br/>
> 2. Restaurant Staff:<br />
> - Update number of people in a reservation
> - Update time of a reservation
> - Cancel a reservation

 
> ##### Objective
> <br />
> 1. Customers can make reservations <br />
> 2. Restaurant staff can update and cancel reservatiosn <br />

> ##### Constraints
> <br />
> 1. Economic Factors:<br />
> Our product is free to use, reducing costs for restaurants and increasing accessibility for all types of dining facilities. <br />
> 2. Ethics: Our program will be designed with ethical considerations in mind, ensuring fair access and treatment for all users. <br />
> The application adheres to copyright regulations for photos and logos. <br />
> 3. Sustainability and Environmental Factors: <br />
> Our application reduces the need for paper and other supplies by allwoing all reservation to be made on devices, contributing to environmental sustainability.<br />
> 4. Societal Impacts: <br />
> Our application reduces employees' workload and stress, as customers can book their own reservations, without having to speak to an employee. <br />
> 5. Reliability: <br />
> Our system will be designed for reliability, ensuring consistent perfomance and minimizing downtime.

### Solution
#### Solution 1
> <br />
> Our first solution was a simple solution that only allowed users to enter a time and number of people. The majority of our test cases failed as we only had the users enter minimal information.<br />
>
> 
#### Solution 2 
> <br />
> This solution is an improvement over Solution 1 because it provides employees with a limited set of options chosen by the manager. However, it still allows employees the flexibility to choose the length of their shifts.<br />
>
> 
#### Final Solution 
> <br />
>  Our final solution is better than our other two solutions, as the user selects whether they are an employee or a customer. If they are an employee, they are prompted to enter in a code to get access to the employee information. Our final solution includes the customer entering in all of the information needed to book a reservation and allows the customers to view available times, and update their reservation. It also allows the employees to make, view, edit, and delete reservations. This resulted in all of our test cases passing. <br />
> <br />
> Customer Features: <br />
> - Customers can make a reservation by entering in a date, time, number of people, and contact information. <br />
> - Customers can view available time slots for specific dates, in order to choose the best available time for them. <br />
> - Reservations can be updated with the Reservation ID number that was given to the customer. They can update the date, time or number of people for their reservation. <br />
> - Customers can enter in their Reservation ID number and view their reservation information. <br />
> <br/>
> Employees Features: <br />
> - Employees can make a reservation for a customer by inserting the date, time, number of people and customer information. <br />
> - Employees can update a customers reservation. <br />
> - Available time slots for dates can be viewed by employees. <br />
> - All reservations can be viewed by employees. <br />
> - Employees can cancel reservations. <br />
> <br/>
> Components: <br />
> - Customer
> - Reservation
> - Reservation Manager
> - Staff
> - Util
> - App


#### Table 1: Comparison of Solutions
![image](https://github.com/user-attachments/assets/07432777-84b3-4b4b-8728-812f45b7194a)
>
> Solution #1 <br />
> - Economic Factors: This program is free to use
> - Sustainability and Environmental Factors: The reservation made on electronic devices
> - Societal Impacts: It has limited impact as it has minimal reduction in workload for employees
> - Reliability: It has low reliability as most test cases failed
> - Ethics: It has limited consideration as it only provides limited functionality
> - Summary: This solution was the most basic and only allowed users to enter minimal information. Most test cases failed, indicating low reliability and limited functionality.

> Solution #2 <br />
> - Economic Factors: This program is free to use
> - Sustainability and Environmental Factors: The reservation made on electronic devices
> - Societal Impacts: It has improved societal impacts as some reduction in workload for employees
> - Reliability: It provides improved reliability as most test cases passed
> - Ethics: It has improved consideration as it allows better control for employees
> - Summary: This solution improved on solution 1 by providing employees with a limited set of options chosen by the employees. Although some improved reliablity, some test cases failed.

> Solution #3 <br />
> - Economic Factors: This application is free to use
> - Sustainability and Environmental Factors: The reservation made on electronic devices
> - Societal Impacts: It has significant impacts with major reduction in employees workload and stress
> - Reliability: It has high reliability and passed all test cases
> - Ethics: It has high ethical standards with users' roll
> - Summar: The final solution provides the highest scores acrross all factors making it the most suitable solution for the project.

#### Environmental, Societal, Safety and Economic Considerations <br />
> Our design took societal constraints into consideration by ensuring that our product would be beneficial for a restaurants' employees and help them lessen their workload. By giving the customer's the ability to make and update their own reservations, employees no longer have to personally accept calls for reservations.
> Our product also took safety constraints into consideration by only allowing employees to make and view changes with a specific code. This ensures that no one except for employees can view and edit reservations.
> We took economic constraints into consideration as our product would be completely free to use for any restaurant.
>

### Test Cases and Results

#### 4.1 Path Testing <br />
> Path Testing <br />
> The Path testing is to cover all possible paths in a function
> For the addReservation() method in the ReservationManager class, there are two paths that can be taken. The first path is when the requested time slot is available and the second one is when the time slot is not available. These two test cases cover both of these paths.
> Path covered:
> - Valid reservation made
> - Invalid time slot entered
> - Past date entered

#### Figure 1: Path Testing <br />
![image](https://github.com/user-attachments/assets/8c3167d5-ac04-44de-a6ea-dc668d9c215a)

#### 4.2 Integration Testing <br />
> Integration Testing <br />
> The purpose the integration testing was to ensure that the ReservationManager.java integrate correctly with other components and handles various reservation operation. We verify that the program works as a whole when different parts are combined and interact with each other
> [Resevation Manager Test](/TableTrack/tests/ReservationManagerTest.java)

> The test was to cover the following:
> - Valid Reservation: Adding a valid reservation and checking if it is successfully created and stored
> - Invalid Reservation Due to Time Slot Conflit: Attempting to add a reservation when the desried time slot is already booked
> - Invalid Reservation Due to Past Date: Trying to add a reservation with a date that is in the past
> - Valid Cancellation: Canceling an existing reservation and ensuring it is removed from the system
> - Invalid Cancellation: Attempting to cancel a non-existent reservation
> - Valid Update: Updating an existing reservation and verifying that the updated details are correctly stored
> - Invalid Update: Trying to update a non-existent reservation
> - Retrieve All Reservation: Adding multiple reservations and retrieving the list of all reservations to ensure they are correctly stored and retrieved.

#### Table 2: Integration Testing <br />
![image](https://github.com/user-attachments/assets/f08f2d6c-3bd0-4f8e-a650-66f8443629f5)
> The test case 'testUpdateReservation_Valid' in the [Reservation Manager Test](/TableTrack/tests/ReservationManagerTest.java) file, performs Integration testing, because it tests how the Reservation class and the Reservation Manager class interact with each other


#### 4.3 Boundary Value Testing <br />
> Boundary Value Testing <br />
> The purpose of the boundary value testing was to ensure that the Util.java correctly handles edge cases for date and time inputs. Our goal was to verify that the program can handle minimum and maximum valid inputs, as well as invalid formats and special cases.
> [Util Boundary Test](/TableTrack/tests/UtilBoundaryTest.java)


> The test was to cover the following scenario:
> - Min Date: the earliest valid date
> - Max Date: the latest valid Date
> - Min Time: the earliest valid time
> - Max Time: the latest valid time
> - Invalid Time Format
> - Time with Leading Zero: Time input a single digit hour without a leading zero

#### Table 3: Boundary Value Testing <br />
![image](https://github.com/user-attachments/assets/a2fbfd71-9911-46ca-8ab3-1dbea6cef3f6)

> Boundary Value Testing Results: <br />
> - testMinBoundaryDate(): passed. the system parses the minimum valid date
> - testMaxBoundaryDate(): passed. the system handles the maximum valid date
> - testMinBoundaryTime(): passed. the system handles the minimum valid time
> - testMaxBoundaryTime(): passed. the system handles the minimum valid time
> - testvalidTimeFormat(): passed. the system checks invalid format and handles followed by a valid time
> - testTimewithLeadingZero(): passed. the system processes a time input with a single digit hour without a leading zero

#### 4.4 Equivalence Class Testing <br />
> Equivalence Class Testing <br />
> Equivalence class testing was done to enseure that each input is correctly handled, depending on if it is a valid or invalid input
> inputs tested:
> - valid future date
> - invalid date format
> - past date
> - valid time
> - invaild time
> - valid number of people
> - invalid number of people

#### Table 4: Equivalence Class Testing <br />
![image](https://github.com/user-attachments/assets/265f8537-6f7f-4c29-b555-2a428e5738b1)

#### 4.5 State Transition Testing <br />
> State Transition Testing <br />
> The goal of state transition testing for the ReservationManagerStateTransitionTest.java was to make that the application correctly handles the different states and trnasitions involced in the reservation process. We wanted to verify that the program correctly transitions from initial state to gathering reservation details, checks slot availability and appropriately handles both available and unavailable time slots and makes a reservation successfully or handles reservation failure. [Reservation Manager State Transition Test](/TableTrack/tests/ReservationManagerStateTransitionTest.java)

> The test was to cover following:
> - S1: Start -> S2: Gather Reservation Details: event that user initiated the reservation process and provide details such as name, contact number, date, time and number of people)
> - S2: Gather Reservation Details -> S3: Check Slot Availability: event that the program gathers all the necessary details and checks if the desired time slot is available
> - S3: Check Slot Availability -> S4: Reservation Made: event that if the time slot is available, the reservation is successfully booked
> - S3: Check Slot Availability -> S5: Reservation Failed: event that if the slot is not available, the reservation fails
> - S5: Reservation Failed -> S2: Gather Reservation Details for Retry: event that user retries the reservation process by providing new details

#### Table 5: State Transition Testing Table <br />
#### Figure 2: State Transition Testing Diagram <br />
![image](https://github.com/user-attachments/assets/4830b7ee-8c15-4135-bde8-70cbb5b0904f)
![image](https://github.com/user-attachments/assets/da9b0a8e-f12c-4c81-8f2a-fa7b628f9e46)

#### Table 6: State Transition Testing Results <br />
> State Transition Testing Results: <br />
![image](https://github.com/user-attachments/assets/e981d941-f7f5-40d1-8d30-e08fe3620ddf)

#### 4.6 Decision Table Testing <br />
> Decision Table Testing <br />
> The purpose of the decision table testing was to ensure that the ReservationManager.java is able to handle various combiniations of input and conditions when user is making a reservation
> The test will identify and verify how different input condtions affect the system behaviour and the corresponding actions
> - [Decision Table Test Cases](/TableTrack/tests/UtilTest.java)

#### Table 7: Decision Table Testing <br />
![image](https://github.com/user-attachments/assets/571eb9cb-433f-4fc0-af20-13f743f5fedd)

### Team Work
#### Table 8: Week 1 Meeting 
![image](https://github.com/user-attachments/assets/a059f338-5d62-4538-83d1-cdf9268f583d)

#### Table 9: Week 2 Meeting
![image](https://github.com/user-attachments/assets/63a7ce2a-6984-414c-818e-533bcbf82fa2)

#### Table 10: Week 3 Meeting
![image](https://github.com/user-attachments/assets/cffb2bee-4ea9-443d-93b5-75ecc25210ff)

#### Table 11: Week 4 Meeting
![image](https://github.com/user-attachments/assets/d40fb28c-69fa-4fc6-8fef-fc2fe5ac0fff)

#### Table 12: Week 5 Meeting
![image](https://github.com/user-attachments/assets/cea7738d-3589-4760-a118-2d8f11fee67a)

#### Table 13: Week 6 Meeting
![image](https://github.com/user-attachments/assets/2772ee78-8da3-4104-9381-9bcc19c0a5fe)

#### Table 14: Week 7 Meeting
![image](https://github.com/user-attachments/assets/8217de43-73f3-4c3a-9ad2-7742e217edfa)

#### Table 15: Week 8 Meeting
![image](https://github.com/user-attachments/assets/fa592ac0-4b9c-400f-a144-35e2fffbee1f)
 
#### Table 16: Week 9 Meeting
![image](https://github.com/user-attachments/assets/fa82afc2-c6b7-4255-873a-01170badcc9e)

#### Table 17: Week 10 Meeting
![image](https://github.com/user-attachments/assets/5cd4fed1-350f-47a8-a2ab-924edf1dba4e)

#### Table 18: Week 11 Meeting
![image](https://github.com/user-attachments/assets/d0efb7a5-0f81-426b-9a6b-6e3aa750584a)
 
#### Table 19: Week 12 Meeting
![image](https://github.com/user-attachments/assets/35b36712-c7e1-45c8-a2dd-99748bfb89fc)

### Project Management
#### Figure 3: Gantt Chart
![image](https://github.com/user-attachments/assets/3cf456eb-be1e-4b20-95d4-50d2ec805c4a)


### Conclusion and Future Work
**Conclusion:** <br />
> Enhanced Efficiency: Table-Track streamlines reservation management, reducing errors and overbooking, thus enhancing customer satisfaction and optimizing restaurant operations.

> Robust Testing: Our rigorous testing suite ensures the reliability, accuracy, and effectiveness of the system, covering various testing techniques like path testing, data flow analysis, and integration testing.

> Employee Empowerment: By allowing customers to make and update their own reservations, employees can focus more on delivering excellent service, reducing their workload and stress.

**Future Work:** <br />
> We can implement PHP to have a working database
> We can make it into a functioning website
