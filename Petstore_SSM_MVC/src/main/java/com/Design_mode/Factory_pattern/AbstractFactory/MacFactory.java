package com.Design_mode.Factory_pattern.AbstractFactory;

public class MacFactory extends FastFoodFactoryAb {
    @Override
    public Ham CreateHam() {
        return new MacHam();
    }

    @Override
    public Chips CreateChips() {
        return new MacChips();
    }
}
