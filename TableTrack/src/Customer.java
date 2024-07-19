import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class Customer {
    private ReservationManager reservationManager;
    private Scanner scanner;

    public Customer(ReservationManager reservationManager) {
        this.reservationManager = reservationManager;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. Make a Reservation");
            System.out.println("2. View Available Time Slots");
            System.out.println("3. Update Reservation");
            System.out.println("4. Display Booking Info");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    makeReservation();
                    break;
                case 2:
                    viewAvailableTimeSlots();
                    break;
                case 3:
                    updateReservation();
                    break;
                case 4:
                    displayBookingInfo();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void makeReservation() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact information: ");
        String contactInfo = scanner.nextLine();
        LocalDate date = getDateFromUser();
        LocalTime time = getTimeFromUser();
        System.out.print("Enter number of people: ");
        int numberOfPeople = scanner.nextInt();
        scanner.nextLine(); // Consume newline
    
        int reservationId = reservationManager.addReservation(name, contactInfo, date, time, numberOfPeople);
        if (reservationId != -1) {
            System.out.println("Reservation successfully made. Your reservation ID is: " + reservationId);
        } else {
            System.out.println("Sorry, the time slot is not available.");
        }
    }
    

    private void viewAvailableTimeSlots() {
        LocalDate date = getDateFromUser();
        List<LocalTime> availableSlots = reservationManager.getAvailableTimeSlots(date);
        if (availableSlots.isEmpty()) {
            System.out.println("No available time slots for this date.");
        } else {
            System.out.println("Available time slots:");
            for (LocalTime slot : availableSlots) {
                System.out.println(slot);
            }
        }
    }

    private void updateReservation() {
        System.out.print("Enter reservation ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
    
        if (reservationManager.getReservationById(id) != null) {
            System.out.println("Reservation found. You can now proceed to update it.");
            LocalDate date = getDateFromUser();
            LocalTime time = getTimeFromUser();
            System.out.print("Enter new number of people: ");
            int numberOfPeople = scanner.nextInt();
            scanner.nextLine();
    
            if (reservationManager.updateReservation(id, date, time, numberOfPeople)) {
                System.out.println("Reservation successfully updated.");
            } else {
                System.out.println("Time slot not available.");
            }
        } else {
            System.out.println("Reservation ID not found.");
        }
    }

    private void displayBookingInfo() {
        System.out.print("Enter reservation ID to view details: ");
        int id = scanner.nextInt();
        scanner.nextLine();
    
        Reservation reservation = reservationManager.getReservationById(id);
        if (reservation != null) {
            System.out.println("Reservation Details:");
            System.out.println("ID: " + reservation.getId());
            System.out.println("Name: " + reservation.getName());
            System.out.println("Date: " + reservation.getReservationDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            System.out.println("Time: " + reservation.getReservationTime().format(DateTimeFormatter.ofPattern("HH:mm")));
            System.out.println("Number of People: " + reservation.getNumberOfPeople());
        } else {
            System.out.println("Reservation ID not found.");
        }
    }    
    

    private LocalDate getDateFromUser() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate today = LocalDate.now();
        while (true) {
            System.out.print("Enter reservation date (dd/MM/yyyy): ");
            String dateStr = scanner.nextLine().trim(); // Trim leading/trailing spaces
    
            // Check length of the input to prevent invalid length
            if (dateStr.length() != 10) {
                System.out.println("Invalid length. Please enter the date in dd/MM/yyyy format.");
                continue;
            }
    
            // Split input into day, month, and year
            String[] parts = dateStr.split("/");
            if (parts.length != 3) {
                System.out.println("Invalid format. Please enter the date in dd/MM/yyyy format.");
                continue;
            }
    
            try {
                int day = Integer.parseInt(parts[0]);
                int month = Integer.parseInt(parts[1]);
                int year = Integer.parseInt(parts[2]);
    
                // Validate day, month, and year ranges
                if (day < 1 || day > 31) {
                    System.out.println("Invalid day. Please enter a day between 01 and 31.");
                    continue;
                }
                if (month < 1 || month > 12) {
                    System.out.println("Invalid month. Please enter a month between 01 and 12.");
                    continue;
                }
    
                // Handle months with fewer days
                if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
                    System.out.println("Invalid date. The month " + month + " has only 30 days.");
                    continue;
                }
                if (month == 2) {
                    if (day > 29) {
                        System.out.println("Invalid date. February has at most 29 days.");
                        continue;
                    }
                    if (day == 29 && !LocalDate.of(year, month, day).isLeapYear()) {
                        System.out.println("Invalid date. February 29 is only valid in a leap year.");
                        continue;
                    }
                }
    
                // Parse and validate the date
                LocalDate date = LocalDate.of(year, month, day);
                if (date.isBefore(today)) {
                    System.out.println("The date cannot be in the past. Please enter a valid future date.");
                    continue;
                }
    
                return date;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please enter the date in dd/MM/yyyy format.");
            } catch (DateTimeException e) {
                System.out.println("Invalid date. Please enter a valid date in dd/MM/yyyy format.");
            }
        }
    }
    
    

    private LocalTime getTimeFromUser() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        while (true) {
            System.out.print("Enter reservation time (HH:mm): ");
            String timeStr = scanner.nextLine().trim(); // Trim leading/trailing spaces
    
            // Add leading zero if necessary
            if (timeStr.matches("\\d{1,2}:\\d{2}")) {
                if (timeStr.length() == 4) {
                    timeStr = "0" + timeStr;
                }
            } else {
                System.out.println("Invalid format. Please enter time in HH:mm format.");
                continue;
            }
    
            try {
                return LocalTime.parse(timeStr, timeFormatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid time format. Please enter time in HH:mm format.");
            }
        }
    }
    
}
