/*
 * This class is a interface of each reservation
 */
import java.time.LocalDateTime;

public class Reservation {
    private String name;
    private LocalDateTime reservationTime;
    private int numberOfPeople;
    private int id;
    private static int idCounter = 1; 

    // constructer
    public Reservation(String name, LocalDateTime reservationTime, int numberOfPeople) {
        this.name = name;
        this.reservationTime = reservationTime;
        this.numberOfPeople = numberOfPeople;
        this.id = idCounter++;
    }

    //getters
    public String getName() {
        return name;
    }

    public LocalDateTime getReservationTime() {
        return reservationTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public int getId() {
        return id;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setReservationTime(LocalDateTime reservationTime) {
        this.reservationTime = reservationTime;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    // display this message when sone
    @Override
    public String toString() {
        return "Reservation ID: " + id + ", Name: " + name + ", Time: " + reservationTime + ", People: " + numberOfPeople;
    }
}

