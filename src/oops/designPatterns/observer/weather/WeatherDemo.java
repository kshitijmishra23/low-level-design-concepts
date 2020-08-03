package oops.designPatterns.observer.weather;

public class WeatherDemo {

    public static void main(String... args) {

        WeatherData weatherData = new WeatherData();
        weatherData.updates.addListener("temp", new CurrentWeatherListener());
        weatherData.updates.addListener("temp", new StaticsWeatherListener());

        weatherData.updateTemp(39);
        weatherData.updateTemp(45);
    }
}
