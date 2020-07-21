package oops.designPatterns.observer.weather.subscribers;

import oops.designPatterns.observer.weather.publishers.Subject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DetailDisplay implements Observer {

    double temperature;
    double humidity;
    double pressure;
    Subject weatherData;

    public DetailDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void updateDisplay(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    private void display() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println( "\nDetailDisplay :" +
                "\nTime : " + dtf.format(now) +
                "\nTemperature :"  + Double.toString(temperature) +
                "\nHumidity :"  + Double.toString(humidity) +
                "\nAtmospheric Pressure:" + Double.toString(pressure));
    }
}
