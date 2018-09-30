package com.designMode.listener.event.base;

import java.util.Date;
import java.util.Map;

public class Event {
    public static final int ABContactAdded = 100;
    public static final int ABContactRemoved = 101;
    public static final int ABContactChanged = 102;
    public static final int ABCompanyAdded = 103;
    private int eventType;
    private EventAware root;
    private Date date;
    private Map params;

    public Event(int eventType, EventAware root, Map params) {
        super();
        this.eventType = eventType;
        this.root = root;
        this.params = params;
        this.date = new Date();
    }

    public int getEventType() {
        return eventType;
    }

    public EventAware getRoot() {
        return root;
    }

    public Date getDate() {
        return date;
    }

    public Map getParams() {
        return params;
    }

}
