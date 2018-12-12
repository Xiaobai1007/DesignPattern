package com.xiaobai.test;

import com.xiaobai.InterfaceImp.BuilderDirector;
import com.xiaobai.InterfaceImp.IResultBuilderImp;
import com.xiaobai.entity.ResultBuilder;

public class ResultBuilderTest {

    public static void main(String[] args) {
        BuilderDirector builderDirector = new BuilderDirector(new IResultBuilderImp());
        ResultBuilder<String> resultBuilder = builderDirector.builder();
        System.out.println(resultBuilder);
    }

}
