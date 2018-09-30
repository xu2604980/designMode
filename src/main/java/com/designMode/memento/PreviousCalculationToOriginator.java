package com.designMode.memento;

/**
 * <p>
 * Memento Interface to Originator
 * </p>
 * <p>
 * This interface allows the originator to restore its state.
 * </p>
 * <p>
 * 提供给 Originator 的宽接口，允许它访问到先前状态所需的所有数据。
 * <br>
 * 理想情况是只允许 Originator 访问本备忘录的内部状态。
 * </p>
 *
 * @author ex_xuhaichuan
 * @since 2018/9/28 15:33
 */
public interface PreviousCalculationToOriginator {
    int getFirstNumber();

    int getSecondNumber();
}
