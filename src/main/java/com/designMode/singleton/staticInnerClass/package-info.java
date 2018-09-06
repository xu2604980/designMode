/**
 * 虚拟机规范严格规定有且只有以下5种情况必须立即对类进行“初始化”（而加载、验证、准备自然需要在此之前完成）
 * 1. 遇到 new，getstatic，putstatic，invokestatic 这4条字节码指令时，如果类没有进行过初始化，
 * 由需要先触发其初始化。生成这4条指令最常见的 Java 代码场景是：使用 new 关键字实例化对象，读取或设置一个类的静态字段（被 final 修饰的静态字段除外，其已在编译期把值放入了常量池中）
 * 以及调用一个类的静态方法
 */
/**
 * @author ex_xuhaichuan
 *
 */
package com.designMode.singleton.staticInnerClass;