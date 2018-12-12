package com.xiaobai.IO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(33);
        integerList.add(45);
        integerList.add(22);
        integerList.add(2);
        List<Integer> list = new ArrayList<>();
        list.add(1007);
        for (Integer integer : integerList) {
            list.add(integer);
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

}
