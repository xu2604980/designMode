package com.designMode.command;
/**
 * 将命令封装到对象中，以便使用命令来参数化其他对象
 * 或者将命令对象放入队列中进行排队
 * 或者将命令对象的操作记录到日志中，以及支持可撤销的操作
 * @see java.lang.Runnable
 * @see Netflix Hystrix
 * @see javax.swing.Action
 * @author ex_xuhaichuan
 *
 */
@FunctionalInterface
public interface Command {
	void execute();
}
