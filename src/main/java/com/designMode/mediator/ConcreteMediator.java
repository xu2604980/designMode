package com.designMode.mediator;

public class ConcreteMediator extends Mediator {
	private Alarm alarm;
	private CoffeePot coffeePot;
	private Calender calender;
	private Sprinkler sprinkler;
	
	public ConcreteMediator(Alarm alarm, CoffeePot coffeePot,
			Calender calender, Sprinkler sprinkler) {
		super();
		this.alarm = alarm;
		this.coffeePot = coffeePot;
		this.calender = calender;
		this.sprinkler = sprinkler;
	}

	@Override
	public void doEvent(String eventType) {
		switch (eventType) {
		case "alarm":
			doAlarmEvent();
			break;
		
		default:
			break;
		}
	}
	public void doAlarmEvent(){
		alarm.doAlarm();
		coffeePot.doCoffeePot();
		calender.doCalender();
		sprinkler.doSprinkler();
	}
}
