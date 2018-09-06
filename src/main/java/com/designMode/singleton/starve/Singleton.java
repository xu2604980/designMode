package com.designMode.singleton.starve;

/**
 * 饿汉式 - 线程安全
 * 直接实例化
 * 丢失了延迟实例化带来的节约资源的好处
 * @see java.lang.Runtime#getRuntime()
 * @see java.lang.System#getSecurityManager()
 * @author ex_xuhaichuan
 *
 */
public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton(){}
	public static Singleton getInstance(){
		return singleton;
	}
}
