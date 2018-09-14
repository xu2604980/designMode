package com.designMode.template;

public class Tea extends CaffeineBeverage{
	
	@Override
	protected
	void brew() {
		System.out.println("Tea.brew");
	}

	@Override
	protected
	void addCondiments() {
		System.out.println("Tea.addCondiments");
	}

}
