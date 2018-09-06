package com.designMode.listener.event;

import com.designMode.listener.event.base.Event;
import com.designMode.listener.event.base.Listener;

public class ABCompanyListener implements Listener{
	@Override
	public void change(Event event) {
		switch (event.getEventType()) {
		case Event.ABCompanyAdded:
			System.out.println("新增公司");
			break;

		default:
			break;
		}
	}
}
