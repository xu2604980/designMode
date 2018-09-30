package com.designMode.test.singleton.staticInnerClass;

import com.designMode.singleton.staticInnerClass.Singleton;

public class SingletonTest {
    static {
        System.out.println("main class static block...");
    }

    public static void main(String[] args) {
        Singleton.load();
        Singleton.getInstance();
    }
}
