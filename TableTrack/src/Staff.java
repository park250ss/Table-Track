import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class Staff {
    private ReservationManager reservationManager;
    private Scanner scanner;

    public Staff(ReservationManager reservationManager) {
        this.reservationManager = reservationManager;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            System.out.println("\nStaff Menu:");
            System.out.println("1. Make a Reservation");
            System.out.println("2. Update Reservation");
            System.out.println("3. View Available Time Slots");
            System.out.println("4. View All Reservations");
            System.out.println("5. Cancel Reservation");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    makeReservation();
                    break;
                case 2:
                    updateReservation();
                    break;
                case 3:
                    viewAvailableTimeSlots();
                    break;
                case 4:
                    viewAllReservations();
                   break;
                case 5:
                    cancelReservation();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void makeReservation() {
        System.out.print("Enter customer name: ");
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
            System.out.println("Reservation successfully made. Reservation ID is: " + reservationId);
        } else {
            System.out.println("Sorry, the time slot is not available.");
        }
    }

    private void updateReservation() {
        System.out.print("Enter reservation ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (reservationManager.getReservationById(id) != null) {
            System.out.println("Reservation found. Proceed to update it.");
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

    private void viewAllReservations() {
        List<Reservation> reservations = reservationManager.getAllReservations();
        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
        } else {
            System.out.println("All Reservations:");
            for (Reservation reservation : reservations) {
                System.out.println(reservation);
            }
        }
    }

    private void cancelReservation() {
        System.out.print("Enter reservation ID to cancel: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (reservationManager.cancelReservation(id)) {
            System.out.println("Reservation successfully canceled.");
        } else {
            System.out.println("Reservation ID not found.");
        }
    }
}

