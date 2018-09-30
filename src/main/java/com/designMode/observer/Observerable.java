package com.designMode.observer;

/**
 * 表示可以被观察
 *
 * @author ex_xuhaichuan
 */
public interface Observerable {
    /**
     * 注册一个观察者
     *
     * @param o 观察者
     */
    void registerObserver(Observer o);

    /**
     * 移除一个观察者
     *
     * @param o 观察者
     */
    void removeObserver(Observer o);

    /**
     * 唤醒所有观察者
     */
    void notifyObserver();
}
