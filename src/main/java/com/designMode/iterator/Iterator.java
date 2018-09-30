package com.designMode.iterator;

/**
 * 提供一种顺序访问聚合对象元素的方法，并且不暴露聚合对象的内部表示。
 *
 * @param <Item> 指定可迭代元素类
 * @author ex_xuhaichuan
 * @see java.util.Iterator
 * @see java.util.Enumeration
 */
public interface Iterator<Item> {
    Item next();

    boolean hasNext();
}
