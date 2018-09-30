package com.designMode.listener.event;

import com.designMode.listener.event.base.Event;
import com.designMode.listener.event.base.EventAware;

public class EventAwareManager {
    public static void main(String[] args) {
        ABContact a = new ABContact();
        EventAwareManager mgr = new EventAwareManager();
        mgr.addABContact(a);
        ABCompany c = new ABCompany();
        mgr.addABCompany(c);
    }

    public void addABContact(EventAware root) {
        Event event = new Event(Event.ABContactAdded, root, null);
        EventDispatcher.getInstance().dispatchEvent(event);
    }

    public void addABCompany(EventAware root) {
        Event event = new Event(Event.ABCompanyAdded, root, null);
        EventDispatcher.getInstance().dispatchEvent(event);
    }
}
