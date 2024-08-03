
- [Integration Testing](https://github.com/Rsa149/Table-Track/blob/main/docs/testing/integrationtesting/integration_testing_table.png)
- [Boundary Value Testing](https://github.com/Rsa149/Table-Track/blob/main/docs/testing/boundaryvaluetesting/boundaryValueTesting.pdf)
- [Equivalence Class Testing]()
- [Decision Tables Testing](https://github.com/Rsa149/Table-Track/blob/main/docs/testing/decisiontablestesting/decisiontabletesting.png)
- [State Transition Testing](https://github.com/Rsa149/Table-Track/blob/main/docs/testing/statetransitiontesting/stateTransitionTesting.pdf)
- [Use Case Testing: Make a reservation](https://github.com/Rsa149/Table-Track/blob/main/docs/testing/usecasetesting/usecasetesting_make_a_reservation.png)
- [Use Case Testing: Update a reservation](https://github.com/Rsa149/Table-Track/blob/main/docs/testing/usecasetesting/usecasetesting_update_a_reservation.png)
- [Use Case Testing: Cancel reservation](https://github.com/Rsa149/Table-Track/blob/main/docs/testing/usecasetesting/usercasetesting_cancle_reservation.png)

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
