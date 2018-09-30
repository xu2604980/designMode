package com.designMode.singleton.enumSingleton.compare;

import java.io.Serializable;

/**
 * 该 Singleton 在每次序列化的时候都会创建一个新的实例
 * 为了保证只创建一个实例，必须声明所有字段都是 transient，并且提供一个 readResolve() 方法。
 * 如果不适用枚举来实现单例模式，会出现反射攻击，因为通过 setAccessible() 方法可以将私有构造函数的访问级别设置为 public，
 * 然后调用构造函数从而实例化对象。如果要防止这种攻击，需要在构造函数中添加防止实例化第二个对象的代码。
 * <p>
 * 从上面的讨论可以看出，解决序列化和反射攻击很麻烦，而枚举实现不会出现这两种问题，所以说
 * 枚举实现单例模式时最佳实践
 *
 * @author ex_xuhaichuan
 */
public class Singleton implements Serializable {
    private static Singleton singleton;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
