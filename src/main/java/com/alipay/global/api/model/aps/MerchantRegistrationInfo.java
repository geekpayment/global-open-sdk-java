package com.alipay.global.api.model.aps;

import java.util.List;

public class MerchantRegistrationInfo {
    private String referenceMerchantId;
    private String merchantDisplayName;
    private String merchantMCC;
    private Logo logo;
    private List<Website> websites;
    private Address merchantAddress;
    private RegistrationDetail registrationDetail;
    private String shareholderName;
    private String shareholderId;
    private String representativeName;
    private String representativeId;

    public String getReferenceMerchantId() {
        return referenceMerchantId;
    }

    public MerchantRegistrationInfo setReferenceMerchantId(String referenceMerchantId) {
        this.referenceMerchantId = referenceMerchantId;
        return this;
    }

    public String getMerchantDisplayName() {
        return merchantDisplayName;
    }

    public MerchantRegistrationInfo setMerchantDisplayName(String merchantDisplayName) {
        this.merchantDisplayName = merchantDisplayName;
        return this;
    }

    public String getMerchantMCC() {
        return merchantMCC;
    }

    public MerchantRegistrationInfo setMerchantMCC(String merchantMCC) {
        this.merchantMCC = merchantMCC;
        return this;
    }

    public Logo getLogo() {
        return logo;
    }

    public MerchantRegistrationInfo setLogo(Logo logo) {
        this.logo = logo;
        return this;
    }

    public List<Website> getWebsites() {
        return websites;
    }

    public MerchantRegistrationInfo setWebsites(List<Website> websites) {
        this.websites = websites;
        return this;
    }

    public Address getMerchantAddress() {
        return merchantAddress;
    }

    public MerchantRegistrationInfo setMerchantAddress(Address merchantAddress) {
        this.merchantAddress = merchantAddress;
        return this;
    }

    public RegistrationDetail getRegistrationDetail() {
        return registrationDetail;
    }

    public MerchantRegistrationInfo setRegistrationDetail(RegistrationDetail registrationDetail) {
        this.registrationDetail = registrationDetail;
        return this;
    }

    public String getShareholderId() {
        return shareholderId;
    }

    public MerchantRegistrationInfo setShareholderId(String shareholderId) {
        this.shareholderId = shareholderId;
        return this;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public MerchantRegistrationInfo setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
        return this;
    }

    public String getRepresentativeId() {
        return representativeId;
    }

    public MerchantRegistrationInfo setRepresentativeId(String representativeId) {
        this.representativeId = representativeId;
        return this;
    }

    public String getShareholderName() {
        return shareholderName;
    }

    public MerchantRegistrationInfo setShareholderName(String shareholderName) {
        this.shareholderName = shareholderName;
        return this;
    }
}
