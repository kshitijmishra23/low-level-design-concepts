package oops.designPatterns.observer.weather.publishers;

import oops.designPatterns.observer.weather.subscribers.Observer;

public interface Subject {

    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();

}

