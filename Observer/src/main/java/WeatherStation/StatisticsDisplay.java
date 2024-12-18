package WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements WeatherDisplay{
    private List<Float> temperatureHistory = new ArrayList<>();

    @Override
    public void update(float temperature) {
        temperatureHistory.add(temperature);
        float average = (float) temperatureHistory.stream().mapToDouble(Float::doubleValue).average().orElse(0.0);
        System.out.println("Statistics Display: Average temperature is " + average + "°C");
    }
}
