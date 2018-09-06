package com.designMode.observer;

@FunctionalInterface
public interface Observer {
	public void update(String message);
}
