package oops.designPatterns.observer.weather;

import oops.designPatterns.observer.weather.publishers.WeatherData;
import oops.designPatterns.observer.weather.subscribers.DetailDisplay;
import oops.designPatterns.observer.weather.subscribers.ForecastDisplay;
import oops.designPatterns.observer.weather.subscribers.ShortDisplay;

public class ClientDemo {

    public static void main(String args[]){
        WeatherData weatherData = new WeatherData(35.0, 56, 45.5);

        ShortDisplay shortDisplay = new ShortDisplay(weatherData);
        DetailDisplay detailDisplay = new DetailDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);


        weatherData.setTemperature(36.0);
        System.out.println("\n=========Update============\n");
        weatherData.setHumidity(85.0);

    }

}

