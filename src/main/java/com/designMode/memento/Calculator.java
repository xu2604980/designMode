package com.designMode.memento;

/**
 * Originator Interface 代表原始对象
 *
 * @author ex_xuhaichuan
 * @since 2018/9/28 15:31
 */
public interface Calculator {

    /**
     * Create Memento
     *
     * @return com.designMode.memento.PreviousCalculationToCareTaker 备忘录对象
     * @author ex_xuhaichuan
     * @since 2018/9/28 15:38
     */
    PreviousCalculationToCareTaker backupLastCalculation();

    /**
     * setMemento
     *
     * @param memento 备忘录对象
     * @author ex_xuhaichuan
     * @since 2018/9/28 15:38
     */
    void restorePreviousCalculation(PreviousCalculationToCareTaker memento);

    int getCalculationResult();

    void setFirstNumber(int firstNumber);

    void setSecondNumber(int secondNumber);

}
