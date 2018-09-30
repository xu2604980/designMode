package com.designMode.listener.event;

import com.designMode.listener.event.base.Event;
import com.designMode.listener.event.base.Listener;

import java.util.ArrayList;
import java.util.List;

public class EventDispatcher {
    private static EventDispatcher instance = new EventDispatcher();
    private List<Listener> listeners = new ArrayList<Listener>();

    private EventDispatcher() {
        String[] observers = PropertyMgr.getProperty("observers").split(",");
        for (String str : observers) {
            System.out.println(str);
            try {
                this.addListener((Listener) (Class.forName(str).newInstance()));
            } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void addListener(Listener listener) {
        System.out.println(":" + listener);
        if (listener == null) {
            throw new NullPointerException();
        } else {
            listeners.add(listener);
        }
    }

    public static EventDispatcher getInstance() {
        return instance;
    }

    public void dispatchEvent(Event event) {
        listeners.forEach(listener -> listener.change(event));
    }
}
