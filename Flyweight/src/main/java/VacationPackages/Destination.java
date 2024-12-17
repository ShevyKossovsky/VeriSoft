package VacationPackages;

import java.util.Date;

public interface Destination {
    void bookFlight();
    void bookAccommodation();
    boolean isAvailable(Date date);

}
