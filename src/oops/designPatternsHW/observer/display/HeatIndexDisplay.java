package oops.designPatternsHW.observer.display;

import oops.designPatternsHW.observer.weatherData.Subject;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private float heatIndex;
    private Subject weatherData;

    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Heat Index is : " + heatIndex);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        heatIndex = (float) (16.923 + 1.85212 * 10-1 * temperature + 5.37941 * humidity);
        display();
    }
}
