package com.alipay.global.api.response.aps.customs;

import com.alipay.global.api.model.aps.Amount;
import com.alipay.global.api.model.aps.CustomsClearingChannel;
import com.alipay.global.api.model.aps.CustomsIdentityCheckResult;
import com.alipay.global.api.response.AlipayResponse;

public class AlipayApsCustomsDeclareResponse extends AlipayResponse {

    private String pspPaymentId;
    private String pspDeclarationRequestId;
    private String pspCustomsCode;
    private CustomsClearingChannel clearingChannel;
    private String clearingTransactionId;
    private Amount pspOrderAmount;
    private CustomsIdentityCheckResult identityCheckResult;

    public String getPspPaymentId() {
        return pspPaymentId;
    }

    public AlipayApsCustomsDeclareResponse setPspPaymentId(String pspPaymentId) {
        this.pspPaymentId = pspPaymentId;
        return this;
    }

    public String getPspDeclarationRequestId() {
        return pspDeclarationRequestId;
    }

    public AlipayApsCustomsDeclareResponse setPspDeclarationRequestId(String pspDeclarationRequestId) {
        this.pspDeclarationRequestId = pspDeclarationRequestId;
        return this;
    }

    public String getPspCustomsCode() {
        return pspCustomsCode;
    }

    public AlipayApsCustomsDeclareResponse setPspCustomsCode(String pspCustomsCode) {
        this.pspCustomsCode = pspCustomsCode;
        return this;
    }

    public CustomsClearingChannel getClearingChannel() {
        return clearingChannel;
    }

    public AlipayApsCustomsDeclareResponse setClearingChannel(CustomsClearingChannel clearingChannel) {
        this.clearingChannel = clearingChannel;
        return this;
    }

    public String getClearingTransactionId() {
        return clearingTransactionId;
    }

    public AlipayApsCustomsDeclareResponse setClearingTransactionId(String clearingTransactionId) {
        this.clearingTransactionId = clearingTransactionId;
        return this;
    }

    public Amount getPspOrderAmount() {
        return pspOrderAmount;
    }

    public AlipayApsCustomsDeclareResponse setPspOrderAmount(Amount pspOrderAmount) {
        this.pspOrderAmount = pspOrderAmount;
        return this;
    }

    public CustomsIdentityCheckResult getIdentityCheckResult() {
        return identityCheckResult;
    }

    public AlipayApsCustomsDeclareResponse setIdentityCheckResult(CustomsIdentityCheckResult identityCheckResult) {
        this.identityCheckResult = identityCheckResult;
        return this;
    }
}
