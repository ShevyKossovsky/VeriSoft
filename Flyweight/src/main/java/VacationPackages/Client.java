package VacationPackages;

import java.util.Date;

public class Client {

    private DestinationFlyweightFactory factory;

    public Client(DestinationFlyweightFactory factory) {
        this.factory = factory;
    }

    public void orderVacationPackage(String flightDetails, String hotelDetails, Date date) {
        if (factory.isAvailable(flightDetails, hotelDetails, date)) {
            Destination destination = factory.getDestination(flightDetails, hotelDetails, date);
            destination.bookFlight();
            destination.bookAccommodation();
        } else {
            System.out.println("Vacation package not available for the selected date.");
        }
    }

    public void cancelVacationPackage(String flightDetails, String hotelDetails, Date date) {

        String key = flightDetails + hotelDetails;
        if (factory.getDestinations().containsKey(key)) {
            factory.getDestinations().remove(key);
            System.out.println("Vacation has been successfully canceled!");
        }

    }
}
