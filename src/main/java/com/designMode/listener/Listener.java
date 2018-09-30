package com.designMode.listener;

/**
 * 函数式接口，有且仅有一个抽象方法，Object的public方法除外。
 * 可以被lambda表达式和函数引用表达式代替
 * ![设计模式之监听器模式](https://blog.csdn.net/wobendiankun/article/details/39779677)
 *
 * @author ex_xuhaichuan
 */
@FunctionalInterface
public interface Listener {
    void onChange(Event event);

    @Override
    boolean equals(Object obj);
}
