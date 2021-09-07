package com.alipay.global.api.model.aps;

import java.util.List;

public class RegistrationDetail {
    private String legalName;
    private List<Attachment> attachments;
    private List<ContactInfo> contactInfo;
    private RegistrationType registrationType;
    private String registrationNo;
    private Address registrationAddress;
    private BusinessType businessType;
    private String registrationEffectiveDate;
    private String registrationExpireDate;

    public String getLegalName() {
        return legalName;
    }

    public RegistrationDetail setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public RegistrationDetail setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public List<ContactInfo> getContactInfo() {
        return contactInfo;
    }

    public RegistrationDetail setContactInfo(List<ContactInfo> contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }

    public RegistrationType getRegistrationType() {
        return registrationType;
    }

    public RegistrationDetail setRegistrationType(RegistrationType registrationType) {
        this.registrationType = registrationType;
        return this;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public RegistrationDetail setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
        return this;
    }

    public Address getRegistrationAddress() {
        return registrationAddress;
    }

    public RegistrationDetail setRegistrationAddress(Address registrationAddress) {
        this.registrationAddress = registrationAddress;
        return this;
    }

    public BusinessType getBusinessType() {
        return businessType;
    }

    public RegistrationDetail setBusinessType(BusinessType businessType) {
        this.businessType = businessType;
        return this;
    }

    public String getRegistrationEffectiveDate() {
        return registrationEffectiveDate;
    }

    public RegistrationDetail setRegistrationEffectiveDate(String registrationEffectiveDate) {
        this.registrationEffectiveDate = registrationEffectiveDate;
        return this;
    }

    public String getRegistrationExpireDate() {
        return registrationExpireDate;
    }

    public RegistrationDetail setRegistrationExpireDate(String registrationExpireDate) {
        this.registrationExpireDate = registrationExpireDate;
        return this;
    }
}
