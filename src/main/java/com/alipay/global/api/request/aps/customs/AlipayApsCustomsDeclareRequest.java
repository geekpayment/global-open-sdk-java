package com.alipay.global.api.request.aps.customs;

import com.alipay.global.api.model.aps.Amount;
import com.alipay.global.api.model.aps.BuyerCertificate;
import com.alipay.global.api.model.aps.CustomsInfo;
import com.alipay.global.api.model.aps.MerchantCustomsInfo;
import com.alipay.global.api.request.AlipayRequest;
import com.alipay.global.api.response.aps.customs.AlipayApsCustomsDeclareResponse;

public class AlipayApsCustomsDeclareRequest extends AlipayRequest<AlipayApsCustomsDeclareResponse> {
    private String paymentRequestId;
    private String customsDeclarationRequestId;
    private CustomsInfo customs;
    private MerchantCustomsInfo merchantCustomsInfo;
    private Amount declarationAmount;
    private Boolean isSplit;
    private String referenceOrderId;
    private BuyerCertificate buyerCertificate;

    public String getPaymentRequestId() {
        return paymentRequestId;
    }

    public AlipayApsCustomsDeclareRequest setPaymentRequestId(String paymentRequestId) {
        this.paymentRequestId = paymentRequestId;
        return this;
    }

    public String getCustomsDeclarationRequestId() {
        return customsDeclarationRequestId;
    }

    public AlipayApsCustomsDeclareRequest setCustomsDeclarationRequestId(String customsDeclarationRequestId) {
        this.customsDeclarationRequestId = customsDeclarationRequestId;
        return this;
    }

    public CustomsInfo getCustoms() {
        return customs;
    }

    public AlipayApsCustomsDeclareRequest setCustoms(CustomsInfo customs) {
        this.customs = customs;
        return this;
    }

    public MerchantCustomsInfo getMerchantCustomsInfo() {
        return merchantCustomsInfo;
    }

    public AlipayApsCustomsDeclareRequest setMerchantCustomsInfo(MerchantCustomsInfo merchantCustomsInfo) {
        this.merchantCustomsInfo = merchantCustomsInfo;
        return this;
    }

    public Amount getDeclarationAmount() {
        return declarationAmount;
    }

    public AlipayApsCustomsDeclareRequest setDeclarationAmount(Amount declarationAmount) {
        this.declarationAmount = declarationAmount;
        return this;
    }

    public Boolean getIsSplit() {
        return isSplit;
    }

    public AlipayApsCustomsDeclareRequest setIsSplit(Boolean isSplit) {
        this.isSplit = isSplit;
        return this;
    }

    public String getReferenceOrderId() {
        return referenceOrderId;
    }

    public AlipayApsCustomsDeclareRequest setReferenceOrderId(String referenceOrderId) {
        this.referenceOrderId = referenceOrderId;
        return this;
    }

    public BuyerCertificate getBuyerCertificate() {
        return buyerCertificate;
    }

    public AlipayApsCustomsDeclareRequest setBuyerCertificate(BuyerCertificate buyerCertificate) {
        this.buyerCertificate = buyerCertificate;
        return this;
    }

    @Override
    public Class<AlipayApsCustomsDeclareResponse> getResponseClass() {
        return AlipayApsCustomsDeclareResponse.class;
    }
}
