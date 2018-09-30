package com.designMode.prototype;

/**
 * 使用原型实例指定要创建对象的类型，通过复制这个原型来创建新对象。
 *
 * @author ex_xuhaichuan
 * @see Object#clone()
 */
public abstract class Prototype {
    abstract Prototype myClone();
}
