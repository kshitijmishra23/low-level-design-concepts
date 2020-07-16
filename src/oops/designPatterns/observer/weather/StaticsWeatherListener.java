package oops.designPatterns.observer.weather;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticsWeatherListener implements WeatherListener {

    List<Integer> temps;

    public StaticsWeatherListener() {
        this.temps = new ArrayList<>();
    }

    @Override
    public void updateWeather(String param, int value) {
        if (param == "temp") {
            temps.add(value);
            System.out.println("Update from StaticsWeatherListener. Temp history: " + Arrays.toString(temps.toArray()));
        }
    }
}
