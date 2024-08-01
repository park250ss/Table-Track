/*
 * This class will act like an restaurant staff of mangers.
 * This can have : 
 * addReservation, cancel reservation, getAvailableTimeSlot, update reservation etc.
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ReservationManager {
    private List<Reservation> reservations;

    public ReservationManager() {
        reservations = new ArrayList<>();
    }

    /* This will return true if given date and time slot is available */
    public boolean isTimeSlotAvailable(LocalDate date, LocalTime time) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservationDate().isEqual(date) && reservation.getReservationTime().equals(time)) {
                return false;
            }
        }
        return true;
    }

    /* This function will loop through reservations and return reservation if id matches */
    public Reservation getReservationById(int id) {
        for (Reservation reservation : reservations) {
            if (reservation.getId() == id) {
                return reservation;
            }
        }
        return null;
    }

    /* This function will check for available time and reserve it, otherwise return false */
    public int addReservation(String name, String contactInfo, LocalDate reservationDate, LocalTime reservationTime, int numberOfPeople) {
        LocalDate today = LocalDate.now();
        if (reservationDate.isBefore(today)) {
            return -1;
        }
        
        if (isTimeSlotAvailable(reservationDate, reservationTime)) {
            Reservation newReservation = new Reservation(name, reservationDate, reservationTime, numberOfPeople);
            reservations.add(newReservation);
            return newReservation.getId(); // Return the ID of the newly created reservation
        }
        return -1; // Indicate failure
    }
    

    /* This function will look for a matching id and cancel the reservation if it matches */
    public boolean cancelReservation(int id) {
        Reservation reservation = getReservationById(id);
        if (reservation != null) {
            reservations.remove(reservation);
            return true;
        }
        return false;
    }

    /* This function will update the reservation by providing the id.
     * Note: id will remain the same, you can update time and number of people
     */
    public boolean updateReservation(int id, LocalDate newDate, LocalTime newTime, int newNumberOfPeople) {
        Reservation reservation = getReservationById(id);
        if (reservation != null) {
            reservation.setReservationDate(newDate);
            reservation.setReservationTime(newTime);
            reservation.setNumberOfPeople(newNumberOfPeople);
            return true;
        }
        return false;
    }

    /* This will return the available time slots for a given date */
    public List<LocalTime> getAvailableTimeSlots(LocalDate date) {
        List<LocalTime> availableSlots = new ArrayList<>();
        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(21, 0);

        while (startTime.isBefore(endTime)) {
            if (isTimeSlotAvailable(date, startTime)) {
                availableSlots.add(startTime);
            }
            startTime = startTime.plusHours(1);
        }

        return availableSlots;
    }

    /**
     * Returns a list of all reservations.
     * 
     * @return a list of all reservations
     */
    public List<Reservation> getAllReservations() {
        return new ArrayList<>(reservations);
    }

}
