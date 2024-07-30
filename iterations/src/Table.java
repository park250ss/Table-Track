

class Table {
    private int tableNumber;
    private boolean isReserved;
    private String reservedBy;
    private int numberOfPeople;
    private String contactInfo;

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
        this.isReserved = false;
        this.reservedBy = "";
        this.numberOfPeople = 0;
        this.contactInfo = "";
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void reserve(String reservedBy, int numberOfPeople, String contactInfo) {
        if (!isReserved) {
            this.isReserved = true;
            this.reservedBy = reservedBy;
            this.numberOfPeople = numberOfPeople;
            this.contactInfo = contactInfo;
            System.out.println("Table " + tableNumber + " reserved successfully by " + reservedBy);
        } else {
            System.out.println("Table " + tableNumber + " is already reserved by " + this.reservedBy);
        }
    }

    public void cancelReservation() {
        if (isReserved) {
            System.out.println("Reservation for table " + tableNumber + " by " + reservedBy + " has been canceled.");
            this.isReserved = false;
            this.reservedBy = "";
            this.numberOfPeople = 0;
            this.contactInfo = "";
        } else {
            System.out.println("Table " + tableNumber + " is not reserved.");
        }
    }

    public void displayStatus() {
        if (isReserved) {
            System.out.println("Table " + tableNumber + " is reserved by " + reservedBy + " for " + numberOfPeople + " people. Contact: " + contactInfo);
        } else {
            System.out.println("Table " + tableNumber + " is available.");
        }
    }

    public void modifyReservation(String newReservedBy, int newNumberOfPeople, String newContactInfo) {
        if (isReserved) {
            this.reservedBy = newReservedBy;
            this.numberOfPeople = newNumberOfPeople;
            this.contactInfo = newContactInfo;
            System.out.println("Reservation for table " + tableNumber + " has been modified.");
        } else {
            System.out.println("Table " + tableNumber + " is not reserved.");
        }
    }
}