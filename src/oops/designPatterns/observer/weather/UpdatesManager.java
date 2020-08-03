package oops.designPatterns.observer.weather;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UpdatesManager {

    Map<String, List<WeatherListener>> weatherListenersList = new HashMap<>();

    public UpdatesManager(String... params) {
        for (String p : params) {
            weatherListenersList.put(p, new ArrayList<>());
        }
    }

    public void addListener(String param, WeatherListener weatherListener) {
        this.weatherListenersList.get(param).add(weatherListener);
    }

    public void removeListener(String param, WeatherListener weatherListener) {
        this.weatherListenersList.get(param).remove(weatherListener);
    }

    public void notify(String param, int value) {
        for (WeatherListener wl : this.weatherListenersList.get(param)) {
            wl.updateWeather(param, value);
        }
    }
}
