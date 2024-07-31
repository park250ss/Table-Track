import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UtilTest {

    @BeforeEach
    public void setUp() {
        // Reset the scanner before each test
        Util.setScanner(new Scanner(System.in));
    }

    @Test
    public void testValidDate() {
        String input = "10/08/2024\n"; // valid future date
        Util.setScanner(new Scanner(new ByteArrayInputStream(input.getBytes())));
        LocalDate expectedDate = LocalDate.parse("10/08/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate actualDate = Util.getDateFromUser();
        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void testInvalidFormatThenValidDate() {
        String input = "2024-08-10\n10/08/2024\n"; // invalid format followed by valid date
        Util.setScanner(new Scanner(new ByteArrayInputStream(input.getBytes())));
        LocalDate expectedDate = LocalDate.parse("10/08/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate actualDate = Util.getDateFromUser();
        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void testValidTime() {
        String input = "14:30\n"; // valid time
        Util.setScanner(new Scanner(new ByteArrayInputStream(input.getBytes())));
        LocalTime expectedTime = LocalTime.parse("14:30", DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime actualTime = Util.getTimeFromUser();
        assertEquals(expectedTime, actualTime);
    }

    @Test
    public void testTimeWithLeadingZero() {
        String input = "7:45\n"; // single-digit hour with leading zero
        Util.setScanner(new Scanner(new ByteArrayInputStream(input.getBytes())));
        LocalTime expectedTime = LocalTime.parse("07:45", DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime actualTime = Util.getTimeFromUser();
        assertEquals(expectedTime, actualTime);
    }
}
