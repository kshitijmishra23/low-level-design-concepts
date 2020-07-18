package oops.designPatternsHW.observer.weatherData;

import oops.designPatternsHW.observer.display.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
