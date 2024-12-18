package WeatherStation;

public class CurrentConditionsDisplay implements WeatherDisplay{
    @Override
    public void update(float temperature) {
        System.out.println("Current Conditions: Temperature is " + temperature + "°C");
    }
}
