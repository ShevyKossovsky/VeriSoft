package WeatherStation;

public class Client {
    public static void main(String[] args) {

        // Create the weather station (subject)
        WeatherStation weatherStation = new WeatherStation();

        // Create the observers (displays)
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        // Register the displays with the weather station
        weatherStation.addObserver(currentDisplay);
        weatherStation.addObserver(statisticsDisplay);
        weatherStation.addObserver(forecastDisplay);

        // Simulate temperature updates
        weatherStation.setTemperature(25.0f);
        weatherStation.setTemperature(28.0f);
        weatherStation.setTemperature(20.0f);
    }
}
