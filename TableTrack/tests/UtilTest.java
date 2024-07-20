import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Test;

public class UtilTest {

    @Test
    public void testValidDate() {
        String input = "10/08/2024\n"; // valid future date
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        LocalDate expectedDate = LocalDate.parse("10/08/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate actualDate = Util.getDateFromUser();
        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void testInvalidFormatThenValidDate() {
        String input = "2024-08-10\n10/08/2024\n"; // invalid format followed by valid date
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        LocalDate expectedDate = LocalDate.parse("10/08/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate actualDate = Util.getDateFromUser();
        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void testValidTime() {
        String input = "14:30\n"; // valid time
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        LocalTime expectedTime = LocalTime.parse("14:30", DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime actualTime = Util.getTimeFromUser();
        assertEquals(expectedTime, actualTime);
    }

    @Test
    public void testTimeWithLeadingZero() {
        String input = "7:45\n"; // single-digit hour with leading zero
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        LocalTime expectedTime = LocalTime.parse("07:45", DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime actualTime = Util.getTimeFromUser();
        assertEquals(expectedTime, actualTime);
    }
}

