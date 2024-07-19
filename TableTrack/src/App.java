import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ReservationManager reservationManager = new ReservationManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Restaurant Reservation System");
            System.out.println("Are you a:");
            System.out.println("1. Customer");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    Customer customer = new Customer(reservationManager);
                    customer.displayMenu();
                    break;
                case 2:
                    System.out.println("Thank you for using the Reservation System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

