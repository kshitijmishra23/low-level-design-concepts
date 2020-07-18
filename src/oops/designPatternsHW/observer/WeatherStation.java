package oops.designPatternsHW.observer;

import oops.designPatternsHW.observer.display.CurrentConditionsDisplay;
import oops.designPatternsHW.observer.display.ForecastDisplay;
import oops.designPatternsHW.observer.display.HeatIndexDisplay;
import oops.designPatternsHW.observer.display.StatisticsDisplay;
import oops.designPatternsHW.observer.weatherData.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(10, 20, 40);

        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(15, 25, 45.5f);
    }
}
