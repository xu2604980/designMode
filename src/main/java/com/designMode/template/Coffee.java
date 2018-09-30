package com.designMode.template;

public class Coffee extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Coffee.brew");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Coffee.addCondiments");
    }

}
