package WeatherStation;

// Observer interface for weather displays
public interface WeatherDisplay {
    /**
     * Update the display with the latest temperature.
     *
     * @param temperature the updated temperature
     */
    void update(float temperature);
}
