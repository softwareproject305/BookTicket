import java.time.LocalDate;

public class BookTicket {
     // Instance variables
    private String passengerName;
    private LocalDate passengerDateOfBirth;
    private String passengerNationality;
    private int seatNumber;
    private String destination;
    private double ticketPrice;
    private LocalDate dateOfBooking;
    private String flightClass;

    // Constructor
    public BookTicket(String passengerName, LocalDate passengerDateOfBirth, String passengerNationality,
                      int seatNumber, String destination, double ticketPrice, LocalDate dateOfBooking,
                      String flightClass) {
        this.passengerName = passengerName;
        this.passengerDateOfBirth = passengerDateOfBirth;
        this.passengerNationality = passengerNationality;
        this.seatNumber = seatNumber;
        this.destination = destination;
        this.ticketPrice = ticketPrice;
        this.dateOfBooking = dateOfBooking;
        this.flightClass = flightClass;
    }

    // Getter methods
    public String getPassengerName() {
        return passengerName;
    }

    public LocalDate getPassengerDateOfBirth() {
        return passengerDateOfBirth;
    }

    public String getPassengerNationality() {
        return passengerNationality;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getDestination() {
        return destination;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public LocalDate getDateOfBooking() {
        return dateOfBooking;
    }

    public String getFlightClass() {
        return flightClass;
    }

    // Setter methods
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public void setPassengerDateOfBirth(LocalDate passengerDateOfBirth) {
        this.passengerDateOfBirth = passengerDateOfBirth;
    }

    public void setPassengerNationality(String passengerNationality) {
        this.passengerNationality = passengerNationality;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setDateOfBooking(LocalDate dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    // toString method to provide a formatted string representation of the ticket details
    @Override
    public String toString() {
        return "Ticket Details - \n" +
                "Passenger Name: " + passengerName + "\n" +
                "Passenger Date of Birth: " + passengerDateOfBirth + "\n" +
                "Passenger Nationality: " + passengerNationality + "\n" +
                "Seat Number: " + seatNumber + "\n" +
                "Destination: " + destination + "\n" +
                "Ticket Price: $" + ticketPrice + "\n" +
                "Date of Booking: " + dateOfBooking + "\n" +
                "Flight Class: " + flightClass;
    }
}
