package com.alipay.global.api.model.aps;

import java.util.Date;

public class BuyerCertificate {
    private CertificateType certificateType;
    private String certificateNo;
    private UserName holderName;
    private String effectiveDate;
    private String expireDate;

    public CertificateType getCertificateType() {
        return certificateType;
    }

    public BuyerCertificate setCertificateType(CertificateType certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public BuyerCertificate setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
        return this;
    }

    public UserName getHolderName() {
        return holderName;
    }

    public BuyerCertificate setHolderName(UserName holderName) {
        this.holderName = holderName;
        return this;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public BuyerCertificate setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public BuyerCertificate setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
}
