import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReservationManagerStateTransitionTest {

    private ReservationManager reservationManager;

    @BeforeEach
    public void setUp() {
        reservationManager = new ReservationManager();
    }

    @Test
    public void testSuccessfulReservation() {
        // Start -> InputDetails
        String input = "Seonyu Park\n123-4567\n30/07/2024\n18:00\n4\n"; 
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Util.setScanner(new Scanner(System.in));
        
        // InputDetails -> CheckAvailability -> ReservationMade
        LocalDate date = LocalDate.parse("30/07/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalTime time = LocalTime.parse("18:00", DateTimeFormatter.ofPattern("HH:mm"));
        int reservationId = reservationManager.addReservation("Seonyu Park", "123-4567", date, time, 4);
        
        // Check if the reservation was successful
        Reservation reservation = reservationManager.getReservationById(reservationId);
        assertNotNull(reservation);
        assertEquals("Seonyu Park", reservation.getName());
        assertEquals(date, reservation.getReservationDate());
        assertEquals(time, reservation.getReservationTime());
        assertEquals(4, reservation.getNumberOfPeople());
    }

    @Test
    public void testFailedReservationDueToUnavailableSlot() {
        // Start -> InputDetails
        String input = "Sophia Pasha\n987-6543\n30/07/2024\n18:00\n2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Util.setScanner(new Scanner(System.in));
        
        // Reserve a slot first
        LocalDate date = LocalDate.parse("30/07/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalTime time = LocalTime.parse("18:00", DateTimeFormatter.ofPattern("HH:mm"));
        reservationManager.addReservation("Seonyu Park", "123-4567", date, time, 4);

        // InputDetails -> CheckAvailability -> ReservationFailed
        int reservationId = reservationManager.addReservation("Sophia Pasha", "987-6543", date, time, 2);
        
        // Check if the reservation failed
        assertEquals(-1, reservationId);
    }

    @Test
    public void testFailedReservationThenSuccessful() {
        // Start -> InputDetails
        String input1 = "Seonyu Park\n123-4567\n30/07/2024\n18:00\n4\n";
        System.setIn(new ByteArrayInputStream(input1.getBytes()));
        Util.setScanner(new Scanner(System.in));
        
        // Reserve a slot first
        LocalDate date = LocalDate.parse("30/07/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalTime time = LocalTime.parse("18:00", DateTimeFormatter.ofPattern("HH:mm"));
        reservationManager.addReservation("Seonyu Park", "123-4567", date, time, 4);

        // Start -> InputDetails -> CheckAvailability -> ReservationFailed
        String input2 = "Sophia Pasha\n987-6543\n30/07/2024\n18:00\n2\n";
        System.setIn(new ByteArrayInputStream(input2.getBytes()));
        Util.setScanner(new Scanner(System.in));
        int reservationId1 = reservationManager.addReservation("Sophia Pasha", "987-6543", date, time, 2);
        
        // Check if the first reservation failed
        assertEquals(-1, reservationId1);

        // ReservationFailed -> InputDetails
        String input3 = "Sophia Pasha\n987-6543\n30/07/2024\n19:00\n2\n";
        System.setIn(new ByteArrayInputStream(input3.getBytes()));
        Util.setScanner(new Scanner(System.in));
        
        // InputDetails -> CheckAvailability -> ReservationMade
        LocalTime newTime = LocalTime.parse("19:00", DateTimeFormatter.ofPattern("HH:mm"));
        int reservationId2 = reservationManager.addReservation("Sophia Pasha", "987-6543", date, newTime, 2);
        
        // Check if the second reservation was successful
        Reservation reservation = reservationManager.getReservationById(reservationId2);
        assertNotNull(reservation);
        assertEquals("Sophia Pasha", reservation.getName());
        assertEquals(date, reservation.getReservationDate());
        assertEquals(newTime, reservation.getReservationTime());
        assertEquals(2, reservation.getNumberOfPeople());
    }
}
