package oops.designPatterns.observer.weather.subscribers;

import oops.designPatterns.observer.weather.publishers.Subject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Observable;

public class ShortDisplay implements Observer {

    double temperature;
    double humidity;
    Subject weatherData;

    public ShortDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void updateDisplay(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println ("\nShortDisplay" +
                "\nTime : " + dtf.format(now) +
                "\nTemperature :"  + Double.toString(temperature) +
                "\nHumidity :"  + Double.toString(humidity) );
    }


}
