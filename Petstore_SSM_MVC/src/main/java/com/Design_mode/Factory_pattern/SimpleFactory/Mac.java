package com.Design_mode.Factory_pattern.SimpleFactory;

import com.Design_mode.Factory_pattern.SimpleFactory.FastFood;

public class Mac extends FastFood {

    @Override
    public void show() {
        this.brand = "麦当劳";
        System.out.println("欢迎来到"+ this.brand);
    }

}
