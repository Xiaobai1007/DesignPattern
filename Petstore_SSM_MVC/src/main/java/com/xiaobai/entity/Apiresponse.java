package com.xiaobai.entity;

import org.springframework.format.annotation.DateTimeFormat;

public class Apiresponse {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Integer apiresponseCode;

    private String apiresponseType;

    private String apiresponseMessage;

    public Integer getApiresponseCode() {
        return apiresponseCode;
    }

    public void setApiresponseCode(Integer apiresponseCode) {
        this.apiresponseCode = apiresponseCode;
    }

    public String getApiresponseType() {
        return apiresponseType;
    }

    public void setApiresponseType(String apiresponseType) {
        this.apiresponseType = apiresponseType == null ? null : apiresponseType.trim();
    }

    public String getApiresponseMessage() {
        return apiresponseMessage;
    }

    public void setApiresponseMessage(String apiresponseMessage) {
        this.apiresponseMessage = apiresponseMessage == null ? null : apiresponseMessage.trim();
    }
}