package com.designMode.simpleFactory;

public class Client {
	public static void main(String[] args) {
		SimpleFactory factory = new SimpleFactory();
		Product product = factory.createProduct(1);
	}
}
