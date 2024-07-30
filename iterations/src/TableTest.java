import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TableTest {
    Table table;

    @BeforeEach
    void setUp() {
        table = new Table(1);
    }

    @Test
    void testReserveTable() {
        table.reserve("Alice");
        assertTrue(table.isReserved());
        assertEquals("Table 1 reserved successfully by Alice", outContent.toString().trim());
    }

    @Test
    void testReserveAlreadyReservedTable() {
        table.reserve("Alice");
        table.reserve("Bob");
        assertTrue(table.isReserved());
        assertEquals("Alice", table.getReservedBy());
        assertEquals("Table 1 is already reserved by Alice", outContent.toString().trim());
    }

    @Test
    void testCancelReservation() {
        table.reserve("Alice");
        table.cancelReservation();
        assertFalse(table.isReserved());
        assertEquals("Reservation for table 1 by Alice has been canceled.", outContent.toString().trim());
    }

    @Test
    void testCancelNonReservedTable() {
        table.cancelReservation();
        assertFalse(table.isReserved());
        assertEquals("Table 1 is not reserved.", outContent.toString().trim());
    }

    @Test
    void testDisplayStatus() {
        table.displayStatus();
        assertEquals("Table 1 is available.", outContent.toString().trim());
        table.reserve("Alice");
        table.displayStatus();
        assertEquals("Table 1 is reserved by Alice", outContent.toString().trim());
    }
}
