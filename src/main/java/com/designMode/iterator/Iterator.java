package com.designMode.iterator;

/**
 * 提供一种顺序访问聚合对象元素的方法，并且不暴露聚合对象的内部表示。
 * @see java.util.Iterator
 * @see java.util.Enumeration
 * @author ex_xuhaichuan
 *
 * @param <Item>
 */
public interface Iterator<Item> {
	Item next();
	boolean hasNext();
}
