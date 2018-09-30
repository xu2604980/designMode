package com.designMode.singleton.lazy;

/**
 * 懒汉式
 * singleton 变量被延迟实例化，如果没有用到该类，那么就不实例化
 * 节约资源
 * 线程不安全
 *
 * @author ex_xuhaichuan
 * @see java.awt.Desktop#getDesktop()
 */
public class Singleton {
    //静态私有成员（本类对象，未初始化）
    private static Singleton singleton;

    //构造方法私有化，外部无法创建本类对象
    private Singleton() {
    }

    //公共静态方法，返回静态成员
    public static Singleton getInstance() {
        //第一次调用时才初始化对象
        /*
         * 多线程环境下，如果多个线程能够
         * 同时进入该判断并且此时 singleton 为 null
         * 此时多个线程会执行实例化操作，这将导致多个 singleton 的出现
         */
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
