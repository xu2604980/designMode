package com.designMode.observer.csnotes;

/**
 * 模拟天气数据源
 *
 * @author ex_xuhaichuan
 * @since 2018/9/30 14:17
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        Observer currentConditionsDisplay = new CurrentConditionsDisplay(data);
        Observer statisticsDisplay = new StatisticsDisplay(data);

        data.setMeasurements(0, 0, 0);
        data.setMeasurements(1, 1, 1);
    }
}
