package oops.designPatterns.observer.weather.subscribers;

import oops.designPatterns.observer.weather.publishers.Subject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

public class ForecastDisplay implements Observer{

    double temperature;
    double humidity;
    double pressure;
    Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void updateDisplay(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now().plusHours(5);
        System.out.println( "Forecast Display\n" +
                "\nForecastTime " + dtf.format(now) +
                "\nTemperature :"  + Double.toString(getTemperatureForecast()) +
                "\nHumidity :"  + Double.toString(getHumidityForecast()) +
                "\nAtmospheric Pressure:" + Double.toString(getAtmosphericPressureForecast()));
    }

    public double getAtmosphericPressureForecast(){
        return pressure + getRandom(-10.0,10.0);
    }

    public double getHumidityForecast(){
        return humidity + getRandom(-15.0,15.0);
    }

    public double getTemperatureForecast(){
        return temperature + getRandom(-5.0,5.0);
    }

    private double getRandom(double min, double max) {
        Random r = new Random();
        return (r.nextInt((int)((max-min)*10+1))+min*10) / 10.0;
    }
}
