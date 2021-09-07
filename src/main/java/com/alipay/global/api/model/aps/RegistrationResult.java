package com.alipay.global.api.model.aps;

public class RegistrationResult {
    private RegistrationStatusType registrationStatus;

    public RegistrationStatusType getRegistrationStatus() {
        return registrationStatus;
    }

    public RegistrationResult setRegistrationStatus(RegistrationStatusType registrationStatus) {
        this.registrationStatus = registrationStatus;
        return this;
    }
}
