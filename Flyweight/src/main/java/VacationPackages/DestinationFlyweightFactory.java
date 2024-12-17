package VacationPackages;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DestinationFlyweightFactory {
    private Map<String, Destination> destinations = new HashMap<>();

    public boolean isAvailable(String flightDetails, String hotelDetails, Date date) {
        String key = flightDetails + hotelDetails;
        if (destinations.containsKey(key)) {
            return destinations.get(key).isAvailable(date);
        }
        return false;
    }

    public Destination getDestination(String flightDetails, String hotelDetails, Date availableDate) {
        String key = flightDetails + hotelDetails;

        if (!destinations.containsKey(key)) {
            destinations.put(key, new ConcreteDestination(flightDetails, hotelDetails, availableDate));
        }
        return destinations.get(key);
    }

    public Map<String, Destination> getDestinations() {
        return destinations;
    }


}
