import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Test;

public class ReservationTest {

    @Test
    public void testReservationConstructor() {
        LocalDate date = LocalDate.of(2024, 8, 10);
        LocalTime time = LocalTime.of(19, 30);
        Reservation reservation = new Reservation("Sophia", date, time, 4);
        
        assertEquals("Sophia", reservation.getName());
        assertEquals(date, reservation.getReservationDate());
        assertEquals(time, reservation.getReservationTime());
        assertEquals(4, reservation.getNumberOfPeople());
    }

    @Test
    public void testGetters() {
        LocalDate date = LocalDate.of(2024, 8, 10);
        LocalTime time = LocalTime.of(19, 30);
        Reservation reservation = new Reservation("Jane Smith", date, time, 2);
        
        assertEquals("Jane Smith", reservation.getName());
        assertEquals(date, reservation.getReservationDate());
        assertEquals(time, reservation.getReservationTime());
        assertEquals(2, reservation.getNumberOfPeople());
    }

    @Test
    public void testSetters() {
        LocalDate date = LocalDate.of(2024, 8, 10);
        LocalTime time = LocalTime.of(19, 30);
        Reservation reservation = new Reservation("Sophia", date, time, 4);
        
        reservation.setName("Raman");
        reservation.setReservationDate(LocalDate.of(2024, 8, 15));
        reservation.setReservationTime(LocalTime.of(20, 00));
        reservation.setNumberOfPeople(6);
        
        assertEquals("Raman", reservation.getName());
        assertEquals(LocalDate.of(2024, 8, 15), reservation.getReservationDate());
        assertEquals(LocalTime.of(20, 00), reservation.getReservationTime());
        assertEquals(6, reservation.getNumberOfPeople());
    }

    @Test
    public void testToString() {
        LocalDate date = LocalDate.of(2024, 8, 10);
        LocalTime time = LocalTime.of(19, 30);
        Reservation reservation = new Reservation("Sophia", date, time, 4);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String expected = "Reservation ID: " + reservation.getId() + ", Name: Sophia, Date: " + date.format(dateFormatter) + ", Time: " + time + ", People: 4";
        
        assertEquals(expected, reservation.toString());
    }
}

