package com.alipay.global.api.response.aps.registeration;

import com.alipay.global.api.response.AlipayResponse;

public class AlipayApsRegistrationResponse extends AlipayResponse {
    private String passThroughInfo;

    public String getPassThroughInfo() {
        return passThroughInfo;
    }

    public AlipayApsRegistrationResponse setPassThroughInfo(String passThroughInfo) {
        this.passThroughInfo = passThroughInfo;
        return this;
    }
}
