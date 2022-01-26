package com.alipay.global.api.model.aps;

public class MerchantCustomsInfo {
    private String merchantCustomsCode;
    private String merchantCustomsName;

    public String getMerchantCustomsCode() {
        return merchantCustomsCode;
    }

    public MerchantCustomsInfo setMerchantCustomsCode(String merchantCustomsCode) {
        this.merchantCustomsCode = merchantCustomsCode;
        return this;
    }

    public String getMerchantCustomsName() {
        return merchantCustomsName;
    }

    public MerchantCustomsInfo setMerchantCustomsName(String merchantCustomsName) {
        this.merchantCustomsName = merchantCustomsName;
        return this;
    }
}
