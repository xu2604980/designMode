package com.designMode.template;

public class Client {

	public static void main(String[] args) {
		Factory.getCaffeineBeverage("Coffee").prepareRecipe();
		System.out.println("------------------");
		Factory.getCaffeineBeverage("Tea").prepareRecipe();
	}

}
