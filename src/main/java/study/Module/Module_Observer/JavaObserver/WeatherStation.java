package study.Module.Module_Observer.JavaObserver;


/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Observer.JavaObserver
 * @Author: keer
 * @CreateTime: 2020-02-02 10:02
 * @Description:
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(25.6f, 30.5f, 33.5f);

    }
}
