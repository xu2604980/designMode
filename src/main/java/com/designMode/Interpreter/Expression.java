package com.designMode.Interpreter;
/**
 * 为语言创建解释器，通常由语言的语法和语法分析来定义。
 * @see java.util.Pattern
 * @see java.text.Normalizer
 * @see All subclasses of java.text.Format
 * @see javax.el.ELResolver
 * @author ex_xuhaichuan
 *
 */
public abstract class Expression {
	public abstract boolean interpret(String str);
}
