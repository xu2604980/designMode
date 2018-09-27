package com.designMode.singleton.staticInnerClass;
/**
 * @author ex_xuhaichuan
 *
 * 静态内部类实现
 * 当 Singleton 类加载时，静态内部类 SingletonHolder 没有被加载进内存。
 * 只有当调用 getInstance() 方法从而触发 SingletonHolder.INSTANCE 时 SingletonHolder 才会被加载，此时初始化 INSTANCE 实例。
 * 这种方式不仅具有延迟初始化的好处，而且由虚拟机提供了对线程安全的支持。
 *
 * 缺点：无法传参
 */
public class Singleton {
	static{
		System.out.println("Singleton static...");
	}
	private Singleton(){}
	
	private static class SingletonHolder{
		static{
			System.out.println("SingletonHolder static...");
		}
		private static final Singleton INSTANCE = new Singleton();
	}
	/**
	* @Description: 调用该方法后，SingletonHolder 类才会被加载
	* @param
	* @Return: 单例对象
	* @Author: ex_xuhaichuan
	*/
	public static Singleton getInstance(){
		return SingletonHolder.INSTANCE;
	}
	//
    /**
    * @Description: 调用该方法后，Singleton 会被加载，先执行 static 块的代码，再执行 load() 方法中的代码。
    * @param
    * @Return: void
    * @Author: ex_xuhaichuan
    */
	public static void load(){
		System.out.println("Singleton load function...");
	}
}
