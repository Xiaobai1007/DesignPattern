package com.Design_mode.Factory_pattern.AbstractFactory;

public class HLSFactory extends FastFoodFactoryAb {
    @Override
    public Ham CreateHam() {
        return new HLSHam();
    }

    @Override
    public Chips CreateChips() {
        return new HLSChips();
    }
}
