package com.designMode.Interpreter;

/**
 * 为语言创建解释器，通常由语言的语法和语法分析来定义。
 *
 * @author ex_xuhaichuan
 * @see java.util.regex.Pattern
 * @see java.text.Normalizer
 * @see java.text.Format
 * @see javax.el.ELResolver
 */
public abstract class Expression {
    public abstract boolean interpret(String str);
}
