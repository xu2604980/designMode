package com.designMode.test.Proxy.staticProxy;

import com.designMode.Proxy.staticProxy.AbstractObject;
import com.designMode.Proxy.staticProxy.ProxyObject;

public class ProxyTest {

	public static void main(String[] args) {
		AbstractObject proxy = new ProxyObject(null);
		proxy.operation();
	}

}
