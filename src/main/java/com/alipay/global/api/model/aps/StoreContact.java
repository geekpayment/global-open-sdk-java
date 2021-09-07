package com.alipay.global.api.model.aps;

public class StoreContact {
    private String identificationId;
    private String fullName;
    private String contactNo;

    public String getIdentificationId() {
        return identificationId;
    }

    public StoreContact setIdentificationId(String identificationId) {
        this.identificationId = identificationId;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public StoreContact setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getContactNo() {
        return contactNo;
    }

    public StoreContact setContactNo(String contactNo) {
        this.contactNo = contactNo;
        return this;
    }
}
