package Head_First.Module_Observer.DIYObserver;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Observer
 * @Author: keer
 * @CreateTime: 2020-01-30 14:26
 * @Description:
 */
public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(25.6f, 30.5f, 33.5f);
    }
}
