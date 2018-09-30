package com.designMode.observer.csnotes;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气主题，保存有天气信息，管理观察者
 *
 * @author ex_xuhaichuan
 * @since 2018/9/30 13:56
 */
public class WeatherData implements Subject {
    private List<Observer> observers;
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 压强
     */
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        observers.forEach((observer) -> {
            observer.update(temperature, humidity, pressure);
        });
    }
}
