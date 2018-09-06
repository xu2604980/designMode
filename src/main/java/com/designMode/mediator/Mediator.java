package com.designMode.mediator;
/**
 * 中介者设计模式
 * 集中相关对象之间复杂的沟通和控制方式
 * 定义一个接口用于与各同事（Colleague）对象通信。
 * @see All scheduleXXX() methods of java.util.Timer
 * @see java.util.concurrent.Executor#execute()
 * @see java.util.concurrent.ExecutorService
 * @see java.util.concurrent.ScheduledExecutorService
 * @see java.lang.reflect.Method#invoke(Object, Object...)
 * @author ex_xuhaichuan
 *
 */
public abstract class Mediator {
	public abstract void doEvent(String eventType);
}
