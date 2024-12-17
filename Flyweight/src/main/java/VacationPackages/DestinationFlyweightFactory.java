package VacationPackages;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DestinationFlyweightFactory {
        private Map<String, Destination> vacations = new HashMap<>();

        // Method to get or create a vacation object for a destination
        public Destination getDestination(String destinationName, String flightDetails, String hotelDetails) {
            Destination destination = vacations.get(destinationName);
            if (destination == null) {
                destination = new ConcreteDestination(destinationName, flightDetails, hotelDetails);
                vacations.put(destinationName, destination);
                System.out.println("Creating new destination: " + destinationName);
            } else {
                System.out.println("Reusing existing destination: " + destinationName);
            }

            return destination;
        }


}
