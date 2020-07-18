package oops.designPatternsHW.observer.display;

import oops.designPatternsHW.observer.weatherData.Subject;

public class ForecastDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast Data : " + temperature + "C /  "+ humidity +"% /" + pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature =temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
