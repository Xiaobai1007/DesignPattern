package com.Design_mode.Factory_pattern.SimpleFactory;

import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        //这里可以指定任意FastFood子类，LSP
        //如果这里是稳定的，不会经常变化，则代码是没有问题的
        //如果这里要不断的变化，new KFC(),new Mac,new Kongfu()...
        Scanner input=new Scanner(System.in);
        System.out.print("您想吃什么：");
        String brand=input.next();

        FastFood kfc = new FastFoodFactory().GetFastFood(brand);
        kfc.show();
    }

}
