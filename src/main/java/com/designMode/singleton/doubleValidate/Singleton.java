package com.designMode.singleton.doubleValidate;

/**
 * 双重校验锁 - 线程安全
 *
 * @author ex_xuhaichuan
 */
public class Singleton {
    /*
     * 采用 volatile 关键字修饰也是很有必要的
     * JVM 具有指令重排的特性，有可能会打乱下面实例化对象时的步骤
     * 单线程环境下无影响
     * 多线程下，有可能获得一个没有初始化的实例，会报错
     * 使用 volatile 可以禁止 JVM 的指令重排，保证正常运行
     */
    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        /* 先判断 singleton 是否已经被实例化
         * 如果没有被实例化才对实例化语句进行加锁
         * 在 singleton == null 的情况下，如果两个线程同时执行 if 语句
         * 那么两个线程就会同时进入 if 语句块内。虽然在 if语句块内有加锁操作
         * 但是两个线程都会执行 singleton = new Singleton();
         * 因此必须使用双重校验锁，也就是两个 if 语句
         */
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    /*
                     * 1.分配内存空间
                     * 2.初始化对象
                     * 3.将 singleton 指向分配的内存地址
                     */
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
