package com.alipay.global.api.model.aps;

import java.util.List;

public class StoreRegistrationInfo {
    private String referenceStoreId;
    private String storeName;
    private String storeMCC;
    private Address storeAddress;
    private String feeTier;
    private List<StoreContact> storeContacts;

    public String getReferenceStoreId() {
        return referenceStoreId;
    }

    public StoreRegistrationInfo setReferenceStoreId(String referenceStoreId) {
        this.referenceStoreId = referenceStoreId;
        return this;
    }

    public String getStoreName() {
        return storeName;
    }

    public StoreRegistrationInfo setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    public String getStoreMCC() {
        return storeMCC;
    }

    public StoreRegistrationInfo setStoreMCC(String storeMCC) {
        this.storeMCC = storeMCC;
        return this;
    }

    public Address getStoreAddress() {
        return storeAddress;
    }

    public StoreRegistrationInfo setStoreAddress(Address storeAddress) {
        this.storeAddress = storeAddress;
        return this;
    }

    public String getFeeTier() {
        return feeTier;
    }

    public StoreRegistrationInfo setFeeTier(String feeTier) {
        this.feeTier = feeTier;
        return this;
    }

    public List<StoreContact> getStoreContacts() {
        return storeContacts;
    }

    public StoreRegistrationInfo setStoreContacts(List<StoreContact> storeContacts) {
        this.storeContacts = storeContacts;
        return this;
    }
}
