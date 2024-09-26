import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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
        LocalDate date = Util.getDateFromUser();
        LocalTime time = Util.getTimeFromUser();
        System.out.print("Enter number of people: ");
        int numberOfPeople = scanner.nextInt();
        scanner.nextLine();
    
        int reservationId = reservationManager.addReservation(name, contactInfo, date, time, numberOfPeople);
        if (reservationId != -1) {
            System.out.println("Reservation successfully made. Your reservation ID is: " + reservationId);
        } else {
            System.out.println("Sorry, the time slot is not available.");
        }
    }
    

    private void viewAvailableTimeSlots() {
        LocalDate date = Util.getDateFromUser();
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
            LocalDate date = Util.getDateFromUser();
            LocalTime time = Util.getTimeFromUser();
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
}
