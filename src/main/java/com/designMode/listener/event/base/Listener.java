package com.designMode.listener.event.base;

@FunctionalInterface
public interface Listener {
    public void change(Event event);
}
