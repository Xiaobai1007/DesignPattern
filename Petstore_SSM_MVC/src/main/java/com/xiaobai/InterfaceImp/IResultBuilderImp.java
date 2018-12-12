package com.xiaobai.InterfaceImp;

import com.xiaobai.MyInterface.IResultBuilder;
import com.xiaobai.entity.ResultBuilder;

public class IResultBuilderImp implements IResultBuilder {
    private ResultBuilder<String> resultBuilder = new ResultBuilder();

    @Override
    public void setCode() {
        resultBuilder.setCode(200);
    }

    @Override
    public void setErrMsg() {
        resultBuilder.setErrMsg("null");
    }

    @Override
    public void setData() {
        resultBuilder.setData("假装有数据");
    }

    @Override
    public void setPager() {
        resultBuilder.setPager(null);
    }

    @Override
    public void setError() {
        resultBuilder.setError(null);
    }

    @Override
    public ResultBuilder createResult() {
        return resultBuilder;
    }
}
