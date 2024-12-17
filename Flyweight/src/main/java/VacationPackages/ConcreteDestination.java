package VacationPackages;

import java.util.Date;

public class ConcreteDestination implements Destination {

    private String flightDetails;
    private String hotelDetails;
    private Date availableDate;

    public ConcreteDestination(String flightDetails, String hotelDetails, Date availableDate) {
        this.flightDetails = flightDetails;
        this.hotelDetails = hotelDetails;
        this.availableDate = availableDate;
    }


    @Override
    public void bookFlight() {
        System.out.println("Booking flight" + flightDetails);
    }

    @Override
    public void bookAccommodation() {
        System.out.println("Booking accommodation" + hotelDetails);
    }
    public boolean isAvailable(Date date) {
        return availableDate.equals(date);
    }
}
