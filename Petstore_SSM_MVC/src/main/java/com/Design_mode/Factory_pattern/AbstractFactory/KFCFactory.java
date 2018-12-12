package com.Design_mode.Factory_pattern.AbstractFactory;

public class KFCFactory extends FastFoodFactoryAb {
    @Override
    public Ham CreateHam() {
        return new KFCHam();
    }

    @Override
    public Chips CreateChips() {
        return new KFCChips();
    }
}
