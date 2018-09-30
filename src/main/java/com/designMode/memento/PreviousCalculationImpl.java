package com.designMode.memento;

/**
 * Memento Object Implementation.
 * <p>
 * Note that this object implements both interfaces to Originator and CareTaker.
 *
 * @author ex_xuhaichuan
 * @since 2018/9/28 15:44
 */
public class PreviousCalculationImpl implements PreviousCalculationToCareTaker, PreviousCalculationToOriginator {
    private int firstNumber;
    private int secondNumber;

    public PreviousCalculationImpl(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public int getFirstNumber() {
        return firstNumber;
    }

    @Override
    public int getSecondNumber() {
        return secondNumber;
    }
}
