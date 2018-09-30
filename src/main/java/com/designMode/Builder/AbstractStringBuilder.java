package com.designMode.Builder;

import java.util.Arrays;

/**
 * 封装一个对象的构造过程，并允许按步骤构造。
 *
 * @author ex_xuhaichuan
 * @see StringBuilder
 * @see java.nio.ByteBuffer
 * @see StringBuffer
 * @see Appendable
 */
public class AbstractStringBuilder {
    protected char[] value;

    protected int count;

    public AbstractStringBuilder(int capacity) {
        count = 0;
        value = new char[capacity];
    }

    public AbstractStringBuilder append(char c) {
        ensureCapacityInternal(count + 1);
        value[count++] = c;
        return this;
    }

    private void ensureCapacityInternal(int minimumCapacity) {
        //如果所需最小容量已经比当前 char 数组的长度大
        if (minimumCapacity - value.length > 0) {
            //扩容
            expandCapacity(minimumCapacity);
        }
    }

    void expandCapacity(int minimumCapacity) {
        System.out.println("扩容");
        // 首先将当前数组长度乘 2 加 2
        //why?
        //空间换时间
        int newCapacity = value.length * 2 + 2;
        //如果仍然达不到所需容量
        if (newCapacity - minimumCapacity < 0) {
            //直接将数组容量扩容到所需容量值
            newCapacity = minimumCapacity;
        }
        if (newCapacity < 0) {
            if (minimumCapacity < 0) {
                throw new OutOfMemoryError();
            }
            newCapacity = Integer.MAX_VALUE;
        }
        System.out.println("扩容后的大小: " + newCapacity);
        value = Arrays.copyOf(value, newCapacity);
    }
}
