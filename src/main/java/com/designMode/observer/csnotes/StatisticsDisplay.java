package com.designMode.observer.csnotes;

/**
 * 一个天气数据布告板
 *
 * @author ex_xuhaichuan
 * @since 2018/9/30 14:12
 */
public class StatisticsDisplay implements Observer {
    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay.update : " + temp + " " + humidity + " " + pressure);
    }
}
