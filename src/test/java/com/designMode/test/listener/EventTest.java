package com.designMode.test.listener;

import com.designMode.listener.Context;
import com.designMode.listener.Event;
import com.designMode.listener.Listener;
import com.designMode.listener.MyListener;
import com.designMode.listener.OtherListener;

public class EventTest {
	public static void main(String[] args) {
		Listener listener = new MyListener();
		Context.addListener(listener);
		Context.addListener(new OtherListener());
		Context.addListener(new OtherListener());
		Context.addListener(new Listener(){
			@Override
			public void onChange(Event event) {
				System.out.println("�����ڲ������");
			}
		});
		Context.addListener(event -> {
			System.out.println("Lambda���ʽ����");
		});
		Context.sendNotification(new Event(Event.INSTALLED,"abc"));
	}
}
