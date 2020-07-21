package oops.designPatterns.observer.weather.subscribers;

import oops.designPatterns.observer.Subject;

public interface Observer {
    public abstract void updateDisplay(double temperature, double humidity, double pressure);
}
