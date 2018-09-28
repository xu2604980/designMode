package com.designMode.memento;

/**
 * <p>
 *     Memento interface to CalculatorOperator (Caretaker)
 * </p>
 * <p>
 *      提供给 Caretaker 的窄接口：它只能将备忘录传递给其他对象；
 * </p>
 * @program: designMode
 * @Date: 2018/9/28 15:36
 * @Author: ex_xuhaichuan
 * @see java.io.Serializable
 */
public interface PreviousCalculationToCareTaker {
    // no operations permitted for the caretaker
}
