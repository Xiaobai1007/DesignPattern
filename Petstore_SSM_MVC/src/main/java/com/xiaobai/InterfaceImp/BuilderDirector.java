package com.xiaobai.InterfaceImp;

import com.xiaobai.MyInterface.IResultBuilder;
import com.xiaobai.entity.ResultBuilder;

public class BuilderDirector {

    private IResultBuilder resultBuilder = null;

    public BuilderDirector(IResultBuilder resultBuilder) {
        this.resultBuilder = resultBuilder;
    }

    public ResultBuilder<String> builder() {
        resultBuilder.setCode();
        resultBuilder.setData();
        resultBuilder.setErrMsg();
        resultBuilder.setError();
        resultBuilder.setPager();
        return resultBuilder.createResult();
    }
}
