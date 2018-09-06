package com.designMode.chainOfResponsibility;
/**
 * 责任链
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系。
 * 将这些对象连成一条链，并沿着这条链发送该请求，直到有一个对象处理它为止。
 * @see java.util.logging.Logger#log()
 * @see Apache Commons Chain
 * @see javax.servlet.Filter#doFilter()
 * @author ex_xuhaichuan
 *
 */
public abstract class Handler {
	//指向下一处理器,如果为 null 则代表没有下一级
	//后继链
	protected Handler successor;
	public Handler(Handler successor){
		this.successor = successor;
	}
	protected abstract void handleRequest(Request request);
}
