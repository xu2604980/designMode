/**
 * 单例设计模式<br>
 * 确保一个类只有一个实例，并提供该实例的全局访问点。<br>
 * 使用<b>一个私有构造函数、一个私有静态变量以及一个公有静态函数来实现。</b><br>
 * 私有构造函数保证了不能通过构造函数来创建对象实例，只能通过公有静态函数返回唯一的私有静态变量。
 *
 * @author ex_xuhaichuan
 * @see java.lang.Runtime#getRuntime()
 * @see java.awt.Desktop#getDesktop()
 * @see java.lang.System#getSecurityManager()
 * @since 2018/9/30 14:24
 * @deprecated
 */
package com.designMode.singleton;