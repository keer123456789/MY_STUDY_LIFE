package study.Module.Module_Observer.JavaObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Observer.JavaObserver
 * @Author: keer
 * @CreateTime: 2020-02-02 09:54
 * @Description: java内置观察者接口实现
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Current Conditions:" + temperature + "F disgree and " + humidity + "% humidity");
    }

    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.humidity = weatherData.getHumidity();
            this.temperature = weatherData.getTemperature();
            display();
        }
    }
}
