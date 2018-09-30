package com.designMode.Proxy.staticProxy;

public class ProxyObject extends AbstractObject {
    private RealObject realObject;

    public ProxyObject(RealObject realObject) {
        this.realObject = realObject;
    }

    @Override
    public void operation() {
        System.out.println("do something before real peration...");
        if (realObject == null) {
            realObject = new RealObject();
        }
        realObject.operation();
        System.out.println("do something after real operation...");
    }

}
