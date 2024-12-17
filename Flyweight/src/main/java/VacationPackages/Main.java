package VacationPackages;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
            // Create the flyweight factory
            DestinationFlyweightFactory flyweightFactory = new DestinationFlyweightFactory();

            // Create a few customers
            Client customer1 = new Client("Alice");
            Client customer2 = new Client("Bob");

            // Customer 1 books vacation packages to different destinations
            customer1.bookVacationPackage(flyweightFactory, "Paris", "Flight to Paris", "Hotel in Paris");
            customer1.bookVacationPackage(flyweightFactory, "Tokyo", "Flight to Tokyo", "Hotel in Tokyo");

            // Customer 2 books vacation packages (Paris already exists in the flyweight factory)
            customer2.bookVacationPackage(flyweightFactory, "Paris", "Flight to Paris", "Hotel in Paris");
            customer2.bookVacationPackage(flyweightFactory, "Tokyo", "Flight to Tokyo", "Hotel in Tokyo");

            // Output shows that Paris is shared between customers

    }
}
