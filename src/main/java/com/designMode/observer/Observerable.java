package com.designMode.observer;

/**
 * 表示可以被观察
 * @author ex_xuhaichuan
 *
 */
public interface Observerable {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}
