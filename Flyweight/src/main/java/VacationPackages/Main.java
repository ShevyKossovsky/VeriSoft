package VacationPackages;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        DestinationFlyweightFactory factory = new DestinationFlyweightFactory();

        Client client = new Client(factory);

        Date vacationDate = new Date(2024, 11, 25);  // 25 לדצמבר 2024

        client.orderVacationPackage("Flight to Paris", "Hotel in Paris", vacationDate);
    }
}
