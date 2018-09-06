package com.designMode.factoryMethod;

import com.designMode.simpleFactory.ConcreteProduct;
import com.designMode.simpleFactory.Product;

public class ConcreteFactory extends Factory {

	@Override
	public Product factoryMethod() {
		return new ConcreteProduct();
	}

}
