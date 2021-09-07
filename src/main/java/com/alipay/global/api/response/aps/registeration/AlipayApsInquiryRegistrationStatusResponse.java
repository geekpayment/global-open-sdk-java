package com.alipay.global.api.response.aps.registeration;

import com.alipay.global.api.model.aps.PSPRegistrationResult;
import com.alipay.global.api.model.aps.RegistrationResult;
import com.alipay.global.api.response.AlipayResponse;

import java.util.List;

public class AlipayApsInquiryRegistrationStatusResponse extends AlipayResponse {

    private RegistrationResult registrationResult;
    private List<PSPRegistrationResult> pspRegistrationResultList;

    public RegistrationResult getRegistrationResult() {
        return registrationResult;
    }

    public AlipayApsInquiryRegistrationStatusResponse setRegistrationResult(RegistrationResult registrationResult) {
        this.registrationResult = registrationResult;
        return this;
    }

    public List<PSPRegistrationResult> getPspRegistrationResultList() {
        return pspRegistrationResultList;
    }

    public AlipayApsInquiryRegistrationStatusResponse setPspRegistrationResultList(List<PSPRegistrationResult> pspRegistrationResultList) {
        this.pspRegistrationResultList = pspRegistrationResultList;
        return this;
    }
}
