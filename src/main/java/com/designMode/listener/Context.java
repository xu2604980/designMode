package com.designMode.listener;

import java.util.ArrayList;
import java.util.List;

public class Context {
	private static List<Listener> list = new ArrayList<Listener>();
	public static void addListener(Listener listener){
		list.add(listener);
	}
	public static void removeListener(Listener listener){
		list.remove(listener);
	}
	public static void sendNotification(Event event){
		list.forEach(listener -> {
			listener.onChange(event);
		});
		
		
	}
}
