package WeatherStation;

import java.util.ArrayList;
import java.util.List;


// Subject class for managing observers and providing temperature updates
public class WeatherStation {
    private List<WeatherDisplay> observers = new ArrayList<>();
    private float temperature;

    /**
     * Registers a new observer to receive updates.
     *
     * @param observer the observer to register
     */
    public void addObserver(WeatherDisplay observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from receiving updates.
     *
     * @param observer the observer to remove
     */
    public void removeObserver(WeatherDisplay observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all registered observers of a temperature change.
     */
    private void notifyObservers() {
        for (WeatherDisplay observer : observers) {
            observer.update(temperature);
        }
    }

    /**
     * Sets the temperature and notifies observers of the update.
     *
     * @param temperature the new temperature
     */
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
