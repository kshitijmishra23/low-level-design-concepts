package oops.designPatterns.observer.weather;

public class WeatherData {

    UpdatesManager updates;
    private int temp;
    private int humidity;
    private int pressure;

    public WeatherData() {
        this.updates = new UpdatesManager("temp", "humidity", "pressure");
    }

    public void updateTemp(int temp) {
        this.temp = temp;
        updates.notify("temp", temp);
    }

    public void updateHumidity(int humidity) {
        this.humidity = humidity;
        updates.notify("humidity", humidity);
    }

    public void updatePressure(int pressure) {
        this.pressure = pressure;
        updates.notify("pressure", pressure);
    }

}
