package TravelBooking;

public class TravelBookingFacade {
    FlightBookingSystem flightBookingSystem;
    HotelBookingSystem hotelBookingSystem;
    RentalCarBookingSystem rentalCarBookingSystem;

    public TravelBookingFacade() {
        flightBookingSystem = new FlightBookingSystem();
        hotelBookingSystem = new HotelBookingSystem();
        rentalCarBookingSystem = new RentalCarBookingSystem();
    }
    public void bookTravel(){
        flightBookingSystem.bookFlight();
        hotelBookingSystem.bookHotel();
        rentalCarBookingSystem.bookCarForRent();
    }
}
