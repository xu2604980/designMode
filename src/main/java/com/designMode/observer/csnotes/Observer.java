package com.designMode.observer.csnotes;

/**
 * 观察者接口，定义了被观察对象状态更新时调用的方法。
 *
 * @author ex_xuhaichuan
 * @since 2018/9/30 13:42
 */
public interface Observer {
    /**
     * 更新天气信息调用的方法
     *
     * @param temp     温度
     * @param humidity 湿度
     * @param pressure 压强
     */
    void update(float temp, float humidity, float pressure);
}
