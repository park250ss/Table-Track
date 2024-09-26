import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReservationManagerTest {
    private ReservationManager reservationManager;

    @BeforeEach
    public void setUp() {
        reservationManager = new ReservationManager();
    }

    @Test
    public void testAddReservation_Valid() {
        LocalDate date = LocalDate.of(2024, 8, 10);
        LocalTime time = LocalTime.of(19, 30);
        int id = reservationManager.addReservation("Raman", "111-1111", date, time, 4);
        
        Reservation reservation = reservationManager.getReservationById(id);
        assertNotNull(reservation, "Reservation should be found."); // there should not be null
        assertEquals("Raman", reservation.getName());
    }

    @Test
    public void testAddReservation_InvalidTimeSlot() {
        LocalDate date = LocalDate.of(2024, 8, 10);
        LocalTime time = LocalTime.of(19, 30);
        reservationManager.addReservation("Sophia", "111-1111", date, time, 4);
        
        int id = reservationManager.addReservation("Raman", "555-5678", date, time, 2);
        assertEquals(-1, id, "Should return -1 for an unavailable time slot."); // this time slot is already booked by sophia
    }

    @Test
    public void testAddReservation_PastDate() {
        LocalDate pastDate = LocalDate.of(2024, 7, 25);
        LocalTime time = LocalTime.of(19, 30);
        int id = reservationManager.addReservation("Sophia", "111-1111", pastDate, time, 4);
        
        assertEquals(-1, id, "Should return -1 for a past date."); 
    }

    @Test
    public void testCancelReservation_Valid() {
        LocalDate date = LocalDate.of(2024, 8, 10);
        LocalTime time = LocalTime.of(19, 30);
        int id = reservationManager.addReservation("Raman", "111-1111", date, time, 4);

        Reservation reservation = reservationManager.getReservationById(id);
        assertNotNull(reservation, "Reservation should be found."); // reservation is found , now try to cancel it.
       
        boolean result = reservationManager.cancelReservation(id);
        assertTrue(result, "Reservation should be canceled.");
        assertNull(reservationManager.getReservationById(id), "Reservation should no longer be found.");
    }

    @Test
    public void testCancelReservation_Invalid() {
        boolean result = reservationManager.cancelReservation(999);
        assertFalse(result, "Cancellation should fail for a non-existent reservation.");
    }

    @Test
    public void testUpdateReservation_Valid() {
        LocalDate date = LocalDate.of(2024, 8, 10);
        LocalTime time = LocalTime.of(19, 30);
        int id = reservationManager.addReservation("Raman", "111-1111", date, time, 4);
        
        LocalDate newDate = LocalDate.of(2024, 8, 11);
        LocalTime newTime = LocalTime.of(20, 00);
        boolean result = reservationManager.updateReservation(id, newDate, newTime, 5);
        
        assertTrue(result, "Reservation should be updated.");
        Reservation reservation = reservationManager.getReservationById(id);
        assertNotNull(reservation, "Reservation should be found.");
        assertEquals(newDate, reservation.getReservationDate());
        assertEquals(newTime, reservation.getReservationTime());
        assertEquals(5, reservation.getNumberOfPeople());
    }

    @Test
    public void testUpdateReservation_Invalid() {
        LocalDate newDate = LocalDate.of(2024, 8, 11);
        LocalTime newTime = LocalTime.of(20, 00);
        boolean result = reservationManager.updateReservation(999, newDate, newTime, 5);
        
        assertFalse(result, "Update don't work if there is no bookings.");
    }

    @Test
    public void testGetAllReservations() {
        LocalDate date1 = LocalDate.of(2024, 8, 10);
        LocalTime time1 = LocalTime.of(19, 30);
        reservationManager.addReservation("Raman", "111-1111", date1, time1, 4);

        LocalDate date2 = LocalDate.of(2024, 8, 11);
        LocalTime time2 = LocalTime.of(20, 00);
        reservationManager.addReservation("Sophia", "222-2222", date2, time2, 2);
        
        List<Reservation> reservations = reservationManager.getAllReservations();
        assertEquals(2, reservations.size(), "There should be 2 reservations.");
    }
}

