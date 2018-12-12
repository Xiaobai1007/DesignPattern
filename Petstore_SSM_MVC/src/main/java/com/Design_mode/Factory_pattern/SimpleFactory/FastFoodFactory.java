package com.Design_mode.Factory_pattern.SimpleFactory;

import com.Design_mode.Factory_pattern.SimpleFactory.FastFood;
import com.Design_mode.Factory_pattern.SimpleFactory.KFC;
import com.Design_mode.Factory_pattern.SimpleFactory.Mac;

/**
 * 快餐工厂
 */
public class FastFoodFactory {
    /***
     * 用于实现不同类型快餐品牌的创建
     * @param brand 类型
     * @return 快餐品牌
     */
    public static FastFood GetFastFood(String brand) {
        switch (brand) {
            case "KFC":
                return new KFC();
            case "Mac":
                return new Mac();
            default:
                throw new IllegalArgumentException("没有该品牌");
        }
    }

}
