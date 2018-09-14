package com.designMode.template;

/**
 * 模板设计模式
 * 定义算法框架，并将一些步骤的实现延迟到子类
 * 抽象出冲咖啡和冲茶的流程。
 * 某些步骤不同，可是有一些相同的步骤。要求复用那些相同步骤的代码。
 * @author ex_xuhaichuan
 *
 */
public abstract class CaffeineBeverage {
	public final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	protected abstract void brew();
	protected abstract void addCondiments();
	protected void boilWater(){
		System.out.println("boilWater");
	}
	protected void pourInCup(){
		System.out.println("pourInCup");
	}
}
