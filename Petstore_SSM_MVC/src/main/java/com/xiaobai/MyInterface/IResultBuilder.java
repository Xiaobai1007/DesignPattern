package com.xiaobai.MyInterface;

import com.xiaobai.entity.ResultBuilder;

public interface IResultBuilder {

    public void setCode();

    public void setErrMsg();

    public void setData();

    public void setPager();

    public void setError();

    public ResultBuilder createResult();

}
