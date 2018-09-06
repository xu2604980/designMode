package com.designMode.mediator;

/**
 * 同事，相关对象
 * @author ex_xuhaichuan
 *
 */
public abstract class Colleague {
	public abstract void onEvent(Mediator mediator);
}
