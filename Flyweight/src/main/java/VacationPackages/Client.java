package VacationPackages;

import java.util.Date;

public class Client {

    private String customerName;

    public Client(String customerName) {
        this.customerName = customerName;
    }

    // Method to book a vacation package
    public void bookVacationPackage(DestinationFlyweightFactory factory, String destinationName,
                                    String flightDetails, String hotelDetails) {
        Destination destination = factory.getDestination(destinationName, flightDetails, hotelDetails);
        System.out.println(customerName + " is booking a vacation package to " + destinationName);
        destination.bookFlight(flightDetails);
        destination.bookAccommodation(hotelDetails);
    }
}
