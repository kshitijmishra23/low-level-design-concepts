package oops.designPatterns.observer.weather;

public class CurrentWeatherListener implements WeatherListener {

    @Override
    public void updateWeather(String param, int value) {
        if (param == "temp") {
            System.out.println("Update from CurrentWeatherListener. Current Temp: " + value);
        }
    }
}
