package com.alipay.global.api.model.aps;

public class PSPRegistrationResult {
    private String pspName;
    private RegistrationResult registrationResult;

    public String getPspName() {
        return pspName;
    }

    public PSPRegistrationResult setPspName(String pspName) {
        this.pspName = pspName;
        return this;
    }

    public RegistrationResult getRegistrationResult() {
        return registrationResult;
    }

    public PSPRegistrationResult setRegistrationResult(RegistrationResult registrationResult) {
        this.registrationResult = registrationResult;
        return this;
    }
}
