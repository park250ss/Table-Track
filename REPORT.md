
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
> In the modern dining industry, efficient management of reservations is critical for enhancing customer satisfaction and optimizing restaurant operations. Many restaurants still rely on outdated, manual reservation systems that are prone to errors, overbooking, and inefficiencies. These systems often result in frustrated customers due to lost reservations, long wait times, and poor table management. Additionally, restaurant staff spends considerable time managing bookings manually, which detracts from their ability to provide excellent customer service.<br />
>
> 
### 2. Design Problem
#### 2.1 Problem Definition <br />
> 
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

 
> **2.2.2 Objective** <br />
> 1. Customers can make reservations <br />
> 2. Restaurant staff can update and cancel reservatiosn <br />

> **2.2.3 Constraints** <br />
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
![image](https://github.com/user-attachments/assets/ae42218f-be82-4ae6-bcb6-10f498387b3d)


### 4. Team Work
#### Table 1: Week 1 Meeting 
![image](https://github.com/user-attachments/assets/a059f338-5d62-4538-83d1-cdf9268f583d)

#### Table 2: Week 2 Meeting
![image](https://github.com/user-attachments/assets/63a7ce2a-6984-414c-818e-533bcbf82fa2)

#### Table 3: Week 3 Meeting
![image](https://github.com/user-attachments/assets/cffb2bee-4ea9-443d-93b5-75ecc25210ff)

#### Table 4: Week 4 Meeting
![image](https://github.com/user-attachments/assets/d40fb28c-69fa-4fc6-8fef-fc2fe5ac0fff)

#### Table 5: Week 5 Meeting
![image](https://github.com/user-attachments/assets/cea7738d-3589-4760-a118-2d8f11fee67a)

#### Table 6: Week 6 Meeting
![image](https://github.com/user-attachments/assets/2772ee78-8da3-4104-9381-9bcc19c0a5fe)

#### Table 7: Week 7 Meeting
![image](https://github.com/user-attachments/assets/8217de43-73f3-4c3a-9ad2-7742e217edfa)

#### Table 8: Week 8 Meeting
![image](https://github.com/user-attachments/assets/fa592ac0-4b9c-400f-a144-35e2fffbee1f)
 
#### Table 9: Week 9 Meeting
![image](https://github.com/user-attachments/assets/fa82afc2-c6b7-4255-873a-01170badcc9e)

#### Table 10: Week 10 Meeting
![image](https://github.com/user-attachments/assets/5cd4fed1-350f-47a8-a2ab-924edf1dba4e)

#### Table 11: Week 11 Meeting
![image](https://github.com/user-attachments/assets/d0efb7a5-0f81-426b-9a6b-6e3aa750584a)
 
#### Table 12: Week 12 Meeting
![image](https://github.com/user-attachments/assets/35b36712-c7e1-45c8-a2dd-99748bfb89fc)

### 5. Project Management
#### Figure 4: Gantt Chart


### 6.Conclusion and Future Work
**Conclusion:** <br />

**Future Work:** <br />
