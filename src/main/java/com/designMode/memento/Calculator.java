package com.designMode.memento;

/**
 * @program: designMode
 * @Date: 2018/9/28 15:31
 * @Author: ex_xuhaichuan
 * @Description: Originator Interface 代表原始对象
 */
public interface Calculator {
    /**
     * @Description: Create Memento
     * @Return: com.designMode.memento.PreviousCalculationToCareTaker 备忘录对象
     * @Author: ex_xuhaichuan
     * @Date: 2018/9/28 15:38
     */
    PreviousCalculationToCareTaker backupLastCalculation();

    /**
     * @param
     * @Description: setMemento
     * @Return: void
     * @Author: ex_xuhaichuan
     * @Date: 2018/9/28 15:38
     */
    void restorePreviousCalculation(PreviousCalculationToCareTaker memento);

    int getCalculationResult();

    void setFirstNumber(int firstNumber);

    void setSecondNumber(int secondNumber);
}
