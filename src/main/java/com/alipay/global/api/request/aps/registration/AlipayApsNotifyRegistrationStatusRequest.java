package com.alipay.global.api.request.aps.registration;

import com.alipay.global.api.model.aps.PSPRegistrationResult;
import com.alipay.global.api.model.aps.RegistrationResult;
import com.alipay.global.api.request.AlipayRequest;
import com.alipay.global.api.response.aps.registeration.AlipayApsNotifyRegistrationStatusResponse;

import java.util.List;

public class AlipayApsNotifyRegistrationStatusRequest extends AlipayRequest<AlipayApsNotifyRegistrationStatusResponse> {
    private String referenceMerchantId;
    private String referenceStoreId;
    private RegistrationResult registrationResult;
    private List<PSPRegistrationResult> pspRegistrationResultList;
    private String registrationRequestId;

    public String getReferenceMerchantId() {
        return referenceMerchantId;
    }

    public AlipayApsNotifyRegistrationStatusRequest setReferenceMerchantId(String referenceMerchantId) {
        this.referenceMerchantId = referenceMerchantId;
        return this;
    }

    public String getReferenceStoreId() {
        return referenceStoreId;
    }

    public AlipayApsNotifyRegistrationStatusRequest setReferenceStoreId(String referenceStoreId) {
        this.referenceStoreId = referenceStoreId;
        return this;
    }

    public RegistrationResult getRegistrationResult() {
        return registrationResult;
    }

    public AlipayApsNotifyRegistrationStatusRequest setRegistrationResult(RegistrationResult registrationResult) {
        this.registrationResult = registrationResult;
        return this;
    }

    public List<PSPRegistrationResult> getPspRegistrationResultList() {
        return pspRegistrationResultList;
    }

    public AlipayApsNotifyRegistrationStatusRequest setPspRegistrationResultList(List<PSPRegistrationResult> pspRegistrationResultList) {
        this.pspRegistrationResultList = pspRegistrationResultList;
        return this;
    }

    public String getRegistrationRequestId() {
        return registrationRequestId;
    }

    public AlipayApsNotifyRegistrationStatusRequest setRegistrationRequestId(String registrationRequestId) {
        this.registrationRequestId = registrationRequestId;
        return this;
    }

    @Override
    public Class<AlipayApsNotifyRegistrationStatusResponse> getResponseClass() {
        return AlipayApsNotifyRegistrationStatusResponse.class;
    }
}
