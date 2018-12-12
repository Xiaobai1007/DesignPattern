package com.Design_mode.Factory_pattern.UniversalFactory;

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


    /***
     * 用于实现不同类型快餐品牌的创建
     * @param brand 类型
     * @return 快餐品牌
     */
    public static FastFood GetFastFoodPro(String brand){
        try{
            return (FastFood)Class.forName("com.Design_mode.Factory_pattern.UniversalFactory."+brand).newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
