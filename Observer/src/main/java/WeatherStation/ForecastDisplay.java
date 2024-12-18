package WeatherStation;

// Displays a basic forecast based on the temperature trend
public class ForecastDisplay implements WeatherDisplay {
    private float lastTemperature;

    @Override
    public void update(float temperature) {
        if (lastTemperature == 0) {
            System.out.println("Forecast Display: Unable to predict, insufficient data.");
        } else if (temperature > lastTemperature) {
            System.out.println("Forecast Display: The weather is getting warmer.");
        } else if (temperature < lastTemperature) {
            System.out.println("Forecast Display: The weather is getting cooler.");
        } else {
            System.out.println("Forecast Display: The weather is steady.");
        }
        lastTemperature = temperature;
    }
}

