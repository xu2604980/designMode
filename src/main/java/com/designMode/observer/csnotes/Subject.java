package com.designMode.observer.csnotes;

/**
 * 主题具有注册和移除观察者、并通知所有观察者的功能。
 * 主题是通过维护一张观察者列表来实现这些操作的。
 *
 * @author ex_xuhaichuan
 * @since 2018/9/30 13:39
 */
public interface Subject {
    /**
     * 注册一个观察者
     *
     * @param o 观察者接口对象
     */
    void registerObserver(Observer o);

    /**
     * 移除一个观察者
     *
     * @param o 观察者接口对象
     */
    void removeObserver(Observer o);

    /**
     * 唤醒所有观察者 ： 调用观察者的 update() 方法
     */
    void notifyObserver();

}
