package com.designMode.chainOfResponsibility;

public class ConcreteHandler2 extends Handler {
	
	public ConcreteHandler2(Handler successor) {
		super(successor);
	}
	
	@Override
	protected void handleRequest(Request request) {
		// 处理自己负责的类型，如果处理，则结束调用（return）
		if(request.getType() == RequestType.type2){
			System.out.println(request.getName() + "is handle by ConcreteHandler2");
			return;
		}
		// 如果有下一级处理器，则继续调用
		if(successor != null){
			successor.handleRequest(request);
		}
	}

}
