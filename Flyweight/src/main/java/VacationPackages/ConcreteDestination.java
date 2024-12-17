package VacationPackages;

import java.util.Date;

public class ConcreteDestination implements Destination {
    private String destinationName;
    private String flightDetails;
    private String hotelDetails;

    // Constructor to initialize the destination's unique details
    public ConcreteDestination(String destinationName, String flightDetails, String hotelDetails) {
        this.destinationName = destinationName;
        this.flightDetails = flightDetails;
        this.hotelDetails = hotelDetails;
    }

    @Override
    public void bookFlight(String flightDetails) {
        System.out.println("Booking flight to " + destinationName + " with details: " + flightDetails);
    }

    @Override
    public void bookAccommodation(String hotelDetails) {
        System.out.println("Booking accommodation at " + destinationName + " with details: " + hotelDetails);
    }

    public String getDestinationName() {
        return destinationName;
    }
}
