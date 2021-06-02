package com.alipay.global.api.model.aps;

public class PaymentMethod {

    private String paymentMethodType;
    private String paymentMethodId;
    private String customerId;
    private PaymentMethodMetaData paymentMethodMetaData;

    public String getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(String paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public PaymentMethodMetaData getPaymentMethodMetaData() {
        return paymentMethodMetaData;
    }

    public void setPaymentMethodMetaData(PaymentMethodMetaData paymentMethodMetaData) {
        this.paymentMethodMetaData = paymentMethodMetaData;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

}
