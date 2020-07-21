package oops.designPatterns.observer.weather.publishers;

import oops.designPatterns.observer.weather.subscribers.Observer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class WeatherData implements Subject {
    private List<Observer> observersList = new ArrayList<>();
    private  double temperature;
    private double humidity;
    private double atmosphericPressure;

    public WeatherData(double temperature, double humidity, double atmosphericPressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.atmosphericPressure = atmosphericPressure;
    }

    public String getData() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println();
        return "Time : " + dtf.format(now) +
                "\nTemperature :"  + Double.toString(getTemperature()) +
                "\nHumidity :"  + Double.toString(getHumidity()) +
                "\n Atmospheric Pressure:" + Double.toString(getAtmosphericPressure());
    }



    public void setTemperature(double temperature){
        this.temperature = temperature;
        notifyObservers();
    }

    public void setHumidity(double humidity){
        this.humidity = humidity;
        notifyObservers();
    }

    public void setAtmosphericPressure(double atmosphericPressure){
        this.atmosphericPressure = atmosphericPressure;
        notifyObservers();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getAtmosphericPressure() {
        return atmosphericPressure;
    }

    public void addObserver(Observer observer){
        observersList.add(observer);
    }

    public void removeObserver(Observer observer){
        observersList.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer : observersList ){
            observer.updateDisplay(getTemperature(), getHumidity(), getAtmosphericPressure());
        }
    }
}
