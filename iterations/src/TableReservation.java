import java.util.InputMismatchException;
import java.util.Scanner;


public class TableReservation {
    private static final String STAFF_USERNAME = "staff";
    private static final String STAFF_PASSWORD = "password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Table[] tables = new Table[10]; 

        for (int i = 0; i < tables.length; i++) {
            tables[i] = new Table(i + 1);
        }

        while (true) {
            System.out.println("1. Reserve a Table");
            System.out.println("2. Cancel a Reservation");
            System.out.println("3. Staff Login");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); 
                continue;
            }
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter table number to reserve: ");
                        int tableNumberToReserve = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.print("Enter your name: ");
                        String reservedBy = scanner.nextLine();
                        if (tableNumberToReserve > 0 && tableNumberToReserve <= tables.length) {
                            System.out.print("Enter number of people: ");
                            int numberOfPeople = scanner.nextInt();
                            scanner.nextLine(); 
                            System.out.print("Enter your contact information: ");
                            String contactInfo = scanner.nextLine();
                            tables[tableNumberToReserve - 1].reserve(reservedBy, numberOfPeople, contactInfo);
                        } else {
                            System.out.println("Invalid table number.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.nextLine(); 
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Enter table number to cancel reservation: ");
                        int tableNumberToCancel = scanner.nextInt();
                        if (tableNumberToCancel > 0 && tableNumberToCancel <= tables.length) {
                            tables[tableNumberToCancel - 1].cancelReservation();
                        } else {
                            System.out.println("Invalid table number.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.nextLine(); 
                    }
                    break;
                case 3:
                    if (staffLogin(scanner)) {
                        while (true) {
                            System.out.println("Staff Options:");
                            System.out.println("1. Display Reservations");
                            System.out.println("2. Modify Reservation");
                            System.out.println("3. Logout");
                            System.out.print("Choose an option: ");
                            int staffChoice = 0;
                            try {
                                staffChoice = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter a number.");
                                scanner.nextLine(); 
                                continue;
                            }
                            scanner.nextLine(); 

                            switch (staffChoice) {
                                case 1:
                                    for (Table table : tables) {
                                        table.displayStatus();
                                    }
                                    break;
                                case 2:
                                    try {
                                        System.out.print("Enter table number to modify reservation: ");
                                        int tableNumberToModify = scanner.nextInt();
                                        scanner.nextLine(); 
                                        if (tableNumberToModify > 0 && tableNumberToModify <= tables.length) {
                                            System.out.print("Enter new customer name: ");
                                            String newReservedBy = scanner.nextLine();
                                            System.out.print("Enter new number of people: ");
                                            int newNumberOfPeople = scanner.nextInt();
                                            scanner.nextLine(); 
                                            System.out.print("Enter new contact information: ");
                                            String newContactInfo = scanner.nextLine();
                                            tables[tableNumberToModify - 1].modifyReservation(newReservedBy, newNumberOfPeople, newContactInfo);
                                        } else {
                                            System.out.println("Invalid table number.");
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("Invalid input. Please enter valid information.");
                                        scanner.nextLine(); 
                                    }
                                    break;
                                case 3:
                                    System.out.println("Logging out...");
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please try again.");
                            }

                            if (staffChoice == 3) {
                                break;
                            }
                        }
                    } else {
                        System.out.println("Invalid login credentials.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static boolean staffLogin(Scanner scanner) {
        System.out.print("Enter staff username: ");
        String username = scanner.nextLine();
        System.out.print("Enter staff password: ");
        String password = scanner.nextLine();

        return STAFF_USERNAME.equals(username) && STAFF_PASSWORD.equals(password);
    }
}