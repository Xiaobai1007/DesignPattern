package com.Design_mode.Factory_pattern.AbstractFactory;

/**
 * 抽象工厂 快餐工厂
 */
public abstract class FastFoodFactoryAb {

    /**
     * 生产汉堡
     */
    public abstract Ham CreateHam();

    /**
     * 生产薯条
     */
    public abstract Chips CreateChips();

    /***
     * 用于实现不同类型快餐品牌的创建
     * @param brand 类型
     * @return 快餐品牌
     */
    public static FastFoodFactoryAb GetFastFood(String brand) {
        switch (brand) {
            case "KFC":
                return new KFCFactory();
            case "Mac":
                return new MacFactory();
            default:
                throw new IllegalArgumentException("没有该品牌");
        }
    }

    /***
     * 用于实现不同类型快餐品牌的创建
     * @param brand 类型
     * @return 快餐品牌
     */
    public static FastFoodFactoryAb GetFastFoodPro(String brand){
        try{
            return (FastFoodFactoryAb)Class.forName("com.Design_mode.Factory_pattern.AbstractFactory."+ brand).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
