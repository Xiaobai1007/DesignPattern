package com.Design_mode.Factory_pattern.UniversalFactory;

import com.Design_mode.Factory_pattern.SimpleFactory.FastFood;

public class HLS extends FastFood {
    @Override
    public void show() {
        System.out.println("欢迎来到华莱士！");
    }
}
