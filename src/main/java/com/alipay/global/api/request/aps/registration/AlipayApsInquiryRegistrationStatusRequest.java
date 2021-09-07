package com.alipay.global.api.request.aps.registration;

import com.alipay.global.api.request.AlipayRequest;
import com.alipay.global.api.response.aps.registeration.AlipayApsInquiryRegistrationStatusResponse;

public class AlipayApsInquiryRegistrationStatusRequest extends AlipayRequest<AlipayApsInquiryRegistrationStatusResponse> {
    private String referenceMerchantId;
    private String referenceStoreId;
    private String registrationRequestId;

    public String getReferenceMerchantId() {
        return referenceMerchantId;
    }

    public AlipayApsInquiryRegistrationStatusRequest setReferenceMerchantId(String referenceMerchantId) {
        this.referenceMerchantId = referenceMerchantId;
        return this;
    }

    public String getReferenceStoreId() {
        return referenceStoreId;
    }

    public AlipayApsInquiryRegistrationStatusRequest setReferenceStoreId(String referenceStoreId) {
        this.referenceStoreId = referenceStoreId;
        return this;
    }

    public String getRegistrationRequestId() {
        return registrationRequestId;
    }

    public AlipayApsInquiryRegistrationStatusRequest setRegistrationRequestId(String registrationRequestId) {
        this.registrationRequestId = registrationRequestId;
        return this;
    }

    @Override
    public Class<AlipayApsInquiryRegistrationStatusResponse> getResponseClass() {
        return AlipayApsInquiryRegistrationStatusResponse.class;
    }
}
