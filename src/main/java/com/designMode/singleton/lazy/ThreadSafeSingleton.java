package com.designMode.singleton.lazy;

/**
 * 懒汉式 - 线程安全
 * 当一个线程进入该方法后，其他线程视图进入该方法都必须等待
 * 性能上有损耗
 *
 * @author ex_xuhaichuan
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton singleton;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (singleton == null) {
            singleton = new ThreadSafeSingleton();
        }
        return singleton;
    }
}
