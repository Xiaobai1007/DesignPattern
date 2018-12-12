package com.Design_mode.Factory_pattern.UniversalFactory;

public class KFC extends FastFood {
    @Override
    public void show() {
        this.brand = "肯德基";
        System.out.println("欢迎来到"+ this.brand);
    }
}
