package com.designMode.listener.event;

import com.designMode.listener.event.base.Event;
import com.designMode.listener.event.base.Listener;

public class ABContactListener implements Listener {

    @Override
    public void change(Event event) {
        switch (event.getEventType()) {
            case Event.ABContactAdded:
                System.out.println("新增联系人");
                break;
            default:
                break;
        }
    }

}
