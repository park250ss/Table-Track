import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class UtilBoundaryTest {

    @Test
    public void testMinBoundaryDate() {
        String input = "30/07/2024\n"; // minimum valid date (assuming today is before this date)
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Util.setScanner(new Scanner(System.in)); 
        LocalDate expectedDate = LocalDate.parse("30/07/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate actualDate = Util.getDateFromUser();
        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void testMaxBoundaryDate() {
        String input = "31/12/2100\n"; // maximum valid date
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Util.setScanner(new Scanner(System.in)); 
        LocalDate expectedDate = LocalDate.parse("31/12/2100", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate actualDate = Util.getDateFromUser();
        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void testMinBoundaryTime() {
        String input = "00:00\n"; // minimum valid time
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Util.setScanner(new Scanner(System.in)); 
        LocalTime expectedTime = LocalTime.parse("00:00", DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime actualTime = Util.getTimeFromUser();
        assertEquals(expectedTime, actualTime);
    }

    @Test
    public void testMaxBoundaryTime() {
        String input = "23:59\n"; // maximum valid time
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Util.setScanner(new Scanner(System.in)); 
        LocalTime expectedTime = LocalTime.parse("23:59", DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime actualTime = Util.getTimeFromUser();
        assertEquals(expectedTime, actualTime);
    }


    @Test
    public void testInvalidTimeFormat() {
        String input = "24:00\n00:00\n"; // invalid time format followed by valid time
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Util.setScanner(new Scanner(System.in)); 
        LocalTime expectedTime = LocalTime.parse("00:00", DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime actualTime = Util.getTimeFromUser();
        assertEquals(expectedTime, actualTime);
    }

    @Test
    public void testTimeWithLeadingZero() {
        String input = "7:45\n"; // single-digit hour without leading zero
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Util.setScanner(new Scanner(System.in)); 
        LocalTime expectedTime = LocalTime.parse("07:45", DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime actualTime = Util.getTimeFromUser();
        assertEquals(expectedTime, actualTime);
    }
}
