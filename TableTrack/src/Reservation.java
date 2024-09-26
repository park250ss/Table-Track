/*
 * This class is a interface of each reservation
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private String name;
    private LocalDate reservationDate;
    private LocalTime reservationTime;
    private int numberOfPeople;
    private int id;
    private static int idCounter = 1; 

    // constructor
    public Reservation(String name, LocalDate reservationDate, LocalTime reservationTime, int numberOfPeople) {
        this.name = name;
        this.reservationDate = reservationDate;
        this.reservationTime = reservationTime;
        this.numberOfPeople = numberOfPeople;
        this.id = idCounter++;
    }

    // getters
    public String getName() {
        return name;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public LocalTime getReservationTime() {
        return reservationTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public int getId() {
        return id;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void setReservationTime(LocalTime reservationTime) {
        this.reservationTime = reservationTime;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    // display this message when done
    @Override
    public String toString() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Reservation ID: " + id + ", Name: " + name + ", Date: " + reservationDate.format(dateFormatter) + ", Time: " + reservationTime + ", People: " + numberOfPeople;
    }
}
