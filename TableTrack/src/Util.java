import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Util {
    private static Scanner scanner = new Scanner(System.in);

    public static LocalDate getDateFromUser() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate today = LocalDate.now();
        while (true) {
            System.out.print("Enter reservation date (dd/MM/yyyy): ");
            String dateStr = scanner.nextLine().trim(); // Trim leading/trailing spaces

            if (!dateStr.matches("\\d{2}/\\d{2}/\\d{4}")) {
                System.out.println("Invalid format. Please enter the date in dd/MM/yyyy format.");
                continue;
            }

            try {
                LocalDate date = LocalDate.parse(dateStr, dateFormatter);
                if (date.isBefore(today)) {
                    System.out.println("The date cannot be in the past. Please enter a valid future date.");
                } else {
                    return date;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date. Please enter a valid date in dd/MM/yyyy format.");
            }
        }
    }

    public static LocalTime getTimeFromUser() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        while (true) {
            System.out.print("Enter reservation time (HH:mm): ");
            String timeStr = scanner.nextLine().trim(); // Trim leading/trailing spaces

            if (!timeStr.matches("\\d{1,2}:\\d{2}")) {
                System.out.println("Invalid format. Please enter time in HH:mm format.");
                continue;
            }

            if (timeStr.length() == 4) {
                timeStr = "0" + timeStr; // Add leading zero if needed
            }

            try {
                return LocalTime.parse(timeStr, timeFormatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid time. Please enter time in HH:mm format.");
            }
        }
    }
}

