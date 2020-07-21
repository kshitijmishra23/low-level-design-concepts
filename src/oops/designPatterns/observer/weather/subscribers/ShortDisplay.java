package oops.designPatterns.observer.weather.subscribers;

import oops.designPatterns.observer.weather.publishers.Subject;

import java.util.Observable;

public class PresentDisplay implements Observer {

    Subject weatherData;

    public PresentDisplay(Subject weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void updateDisplay(double temperature, double humidity, double pressure) {
        
    }
}
