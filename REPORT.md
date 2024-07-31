
# Table-Track
ENSE 375 Software Testing and Validation


## Team Members
Sophia Pasha <br />
Raman Singh <br />
Seonyu Park <br />


## Table of Contents



## List of Figures


## List of Tables
 

### 1. Introduction <br />
> A Restaurant Reservation System<br />
>
> 
### 2. Design Problem
#### 2.1 Problem Definition <br />
> In the modern dining industry, efficient management of reservations is critical for enhancing customer satisfaction and optimizing restaurant operations. Many restaurants still rely on outdated, manual reservation systems that are prone to errors, overbooking, and inefficiencies. These systems often result in frustrated customers due to lost reservations, long wait times, and poor table management. Additionally, restaurant staff spends considerable time managing bookings manually, which detracts from their ability to provide excellent customer service.

> Table Track will provide a command-line interface for both customers and restaurant staff to interact with the reservation system. Customers can make reservations, view available time slots, and receive confirmation of their bookings. Restaurant staff will have access to functionalities such as adding, updating, and canceling reservations.

> Our main objective is to design and develop robust testing suites for this project. We will employ various testing techniques, including path testing, data flow analysis, logic coverage, integration testing, and validation testing. By thoroughly testing the software application, we aim to ensure its reliability, accuracy, and effectiveness in managing restaurant reservations.<br />

#### 2.2 Design Requirements <br />
> **2.2.1 Functions** <br />
> 1. Custmor:<br />
> - View available reservation times
> - Select an available time and number of people for a table
> - Enter name and contact information
> - Confirm reservation
>
> 2. Restaurant Staff:<br />
> - Update number of people in a reservation
> - Update time of a reservation
> - Cancel a reservation
>
> 
> **2.2.2 Objective** <br />
> 1. Customers can make reservations <br />
> 2. Restaurant staff can update and cancel reservatiosn <br />
>
> **2.2.3 Constraints** <br />
> 1. Economic Factors:<br />
> The application is completely free to use and helps in saving on manual supplies. <br />
> 2. Ethics: <br />
> The application adheres to copyright regulations for photos and logos. <br />
> 3. Sustainability and Environmental Factors: <br />
> The application allows users to save paper and supplies.<br />
> 4. Societal Impacts: <br />
> Our application reduces employees' workload and stress, as customers can book their own reservations, without having to speak to an employee. <br />

### 3. Solution
#### Solution 1<br />
> Our first solution was a simple solution that only allowed users to enter a time and number of people. The majority of our test cases failed as we only had the users enter minimal information.<br />
>
> 
#### Solution 2 <br />
> This solution is an improvement over Solution 1 because it provides employees with a limited set of options chosen by the manager. However, it still allows employees the flexibility to choose the length of their shifts.<br />
>
> 
#### Final Solution <br />
>  Our final solution is better than our other two solutions, as the user selects whether they are an employee or a customer. If they are an employee, they are prompted to enter in a code to get access to the employee information. Our final solution includes the customer entering in all of the information needed to book a reservation and allows the customers to view available times, and update their reservation. It also allows the employees to make, view, edit, and delete reservations. This resulted in all of our test cases passing. <br />
> <br />
> Customer Features: <br />
> - Customers can make a reservation by entering in a date, time, number of people, and contact information. <br />
> - Customers can view available time slots for specific dates, in order to choose the best available time for them. <br />
> - Reservations can be updated with the Reservation ID number that was given to the customer. They can update the date, time or number of people for their reservation. <br />
> - Customers can enter in their Reservation ID number and view their reservation information. <br />
>
> Employees Features: <br />
> - Employees can make a reservation for a customer by inserting the date, time, number of people and customer information. <br />
> - Employees can update a customers reservation. <br />
> - Available time slots for dates can be viewed by employees. <br />
> - All reservations can be viewed by employees. <br />
> - Employees can cancel reservations. <br />

#### Figure 6: Design Selection <br  />

#### Table 14: Comparison of Solutions


### 4. Team Work
#### Table 1: Week 1 Meeting 

#### Table 2: Week 2 Meeting

#### Table 3: Week 3 Meeting

#### Table 4: Week 4 Meeting

#### Table 5: Week 5 Meeting

#### Table 6: Week 6 Meeting

#### Table 7: Week 7 Meeting

#### Table 8: Week 8 Meeting
 
#### Table 9: Week 9 Meeting

#### Table 10: Week 10 Meeting

#### Table 11: Week 11 Meeting
 
#### Table 12: Week 12 Meeting

### 5. Project Management
#### Figure 4: Gantt Chart


### 6.Conclusion and Future Work
**Conclusion:** <br />

**Future Work:** <br />
