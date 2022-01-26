package com.alipay.global.api.model.aps;

public class CustomsInfo {
    private String customsCode;
    private String region;

    public String getCustomsCode() {
        return customsCode;
    }

    public CustomsInfo setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public CustomsInfo setRegion(String region) {
        this.region = region;
        return this;
    }
}
