package com.alipay.global.api.model.aps;

public class DeclarationRecord {
    private String customsDeclarationRequestId;
    private String pspDeclarationRequestId;
    private String pspPaymentId;
    private CustomsInfo customs;
    private MerchantCustomsInfo merchantCustomsInfo;
    private Amount declarationAmount;
    private boolean isSplit;
    private String referenceOrderId;
    private String modifiedTime;
    private String customsResultCode;
    private String customsResultDescription;
    private String customsResultReturnedTime;
    private DeclarationRequestStatus declarationRequestStatus;

    public String getCustomsDeclarationRequestId() {
        return customsDeclarationRequestId;
    }

    public DeclarationRecord setCustomsDeclarationRequestId(String customsDeclarationRequestId) {
        this.customsDeclarationRequestId = customsDeclarationRequestId;
        return this;
    }

    public String getPspDeclarationRequestId() {
        return pspDeclarationRequestId;
    }

    public DeclarationRecord setPspDeclarationRequestId(String pspDeclarationRequestId) {
        this.pspDeclarationRequestId = pspDeclarationRequestId;
        return this;
    }

    public String getPspPaymentId() {
        return pspPaymentId;
    }

    public DeclarationRecord setPspPaymentId(String pspPaymentId) {
        this.pspPaymentId = pspPaymentId;
        return this;
    }

    public CustomsInfo getCustoms() {
        return customs;
    }

    public DeclarationRecord setCustoms(CustomsInfo customs) {
        this.customs = customs;
        return this;
    }

    public MerchantCustomsInfo getMerchantCustomsInfo() {
        return merchantCustomsInfo;
    }

    public DeclarationRecord setMerchantCustomsInfo(MerchantCustomsInfo merchantCustomsInfo) {
        this.merchantCustomsInfo = merchantCustomsInfo;
        return this;
    }

    public Amount getDeclarationAmount() {
        return declarationAmount;
    }

    public DeclarationRecord setDeclarationAmount(Amount declarationAmount) {
        this.declarationAmount = declarationAmount;
        return this;
    }

    public boolean isSplit() {
        return isSplit;
    }

    public DeclarationRecord setSplit(boolean split) {
        isSplit = split;
        return this;
    }

    public String getReferenceOrderId() {
        return referenceOrderId;
    }

    public DeclarationRecord setReferenceOrderId(String referenceOrderId) {
        this.referenceOrderId = referenceOrderId;
        return this;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public DeclarationRecord setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    public String getCustomsResultCode() {
        return customsResultCode;
    }

    public DeclarationRecord setCustomsResultCode(String customsResultCode) {
        this.customsResultCode = customsResultCode;
        return this;
    }

    public String getCustomsResultDescription() {
        return customsResultDescription;
    }

    public DeclarationRecord setCustomsResultDescription(String customsResultDescription) {
        this.customsResultDescription = customsResultDescription;
        return this;
    }

    public String getCustomsResultReturnedTime() {
        return customsResultReturnedTime;
    }

    public DeclarationRecord setCustomsResultReturnedTime(String customsResultReturnedTime) {
        this.customsResultReturnedTime = customsResultReturnedTime;
        return this;
    }

    public DeclarationRequestStatus getDeclarationRequestStatus() {
        return declarationRequestStatus;
    }

    public DeclarationRecord setDeclarationRequestStatus(DeclarationRequestStatus declarationRequestStatus) {
        this.declarationRequestStatus = declarationRequestStatus;
        return this;
    }
}
