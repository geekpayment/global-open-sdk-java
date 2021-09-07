package com.alipay.global.api.model.aps;

public class ContactInfo {
    private String contactNo;
    private ContactType contactType;

    public String getContactNo() {
        return contactNo;
    }

    public ContactInfo setContactNo(String contactNo) {
        this.contactNo = contactNo;
        return this;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public ContactInfo setContactType(ContactType contactType) {
        this.contactType = contactType;
        return this;
    }
}
