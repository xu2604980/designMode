package com.designMode.template;

public class Factory {
    public static CaffeineBeverage getCaffeineBeverage(String type) {
        switch (type) {
            case "Coffee":
                return new Coffee();
            case "Tea":
                return new Tea();
            default:
                return new Coffee();
        }
    }
}
