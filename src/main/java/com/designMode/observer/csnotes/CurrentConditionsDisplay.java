package com.designMode.observer.csnotes;

/**
 * 一个天气数据布告板
 *
 * @author ex_xuhaichuan
 * @since 2018/9/30 14:16
 */
public class CurrentConditionsDisplay implements Observer {
    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this::update);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("CurrentConditionsDisplay.update : " + temp + " " + humidity + " " + pressure);
    }
}
