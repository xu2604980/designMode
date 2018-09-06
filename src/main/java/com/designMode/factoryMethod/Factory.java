package com.designMode.factoryMethod;

import com.designMode.simpleFactory.Product;
/**
 * 定义了一个创建对象的接口，但由子类决定要实例化哪个类。工厂方法把实例化操作推迟到子类。
 * 
 * 在简单工厂中，创建对象的是另一个类，而在工厂方法中，是由子类来创建对象。
 * @see java.util.Calendar
 * @see java.util.ResourceBundle
 * @see java.text.NumberFormat
 * @see java.nio.charset.Charset
 * @see java.net.URLStreamHandlerFactory
 * @see java.util.EnumSet
 * @see javax.xml.bind.JAXBContext
 * @author ex_xuhaichuan
 *
 */
public abstract class Factory {
	abstract public Product factoryMethod();
	public void doSomething(){
		Product product = factoryMethod();
		System.out.println(product);
	}
}
