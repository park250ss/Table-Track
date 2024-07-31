import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class UtilEquivalenceTest {

    @Test
    public void testValidFutureDate() {
        String input = "12/08/2024\n"; 
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Util.setScanner(new Scanner(System.in)); 
        LocalDate expectedDate = LocalDate.parse("12/08/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate actualDate = Util.getDateFromUser();
        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void testInvalidDateFormat() {
        String input = "31-08-2024\n"; 
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Util.setScanner(new Scanner(System.in)); 
        assertThrows(RuntimeException.class, () -> Util.getDateFromUser());
    }
    
    @Test
    public void testPastDate() {
        String input = "25/07/2024\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Util.setScanner(new Scanner(System.in)); 
        assertThrows(RuntimeException.class, () -> Util.getDateFromUser());
    }


    @Test
    public void testValidTimeSlot() {
        String input = "21:00\n"; 
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Util.setScanner(new Scanner(System.in)); 
        LocalTime expectedTime = LocalTime.parse("21:00", DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime actualTime = Util.getTimeFromUser();
        assertEquals(expectedTime, actualTime);
    }


    @Test
    public void testInvalidTimeFormat() {
    	String input = "9 PM\n"; 
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Util.setScanner(new Scanner(System.in)); 
        assertThrows(RuntimeException.class, () -> Util.getTimeFromUser());
    }

    @Test
    public void testValidNumberOfPeople() {
        String input = "5\n"; 
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        int expectedNumber = 5;
        int actualNumber = scanner.nextInt();
        assertEquals(expectedNumber, actualNumber);
    }
    
    @Test
    public void testInvalidNumberOfPeople() {
        String input = "0\n"; 
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        Util.setScanner(scanner); 
        assertThrows(RuntimeException.class, () -> {
        	int number = scanner.nextInt();
        	if (number <= 0) {
        		throw new RuntimeException("Invalid number of people");
        	}
        });

    }
}
