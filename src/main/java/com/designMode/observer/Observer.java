package com.designMode.observer;

/**
 * @author ex_xuhaichuan
 */
@FunctionalInterface
public interface Observer {
    /**
     * 更新信息
     *
     * @param message 要更新的信息
     */
    void update(String message);
}
