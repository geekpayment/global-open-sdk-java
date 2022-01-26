package com.alipay.global.api.request.aps.customs;

import com.alipay.global.api.request.AlipayRequest;
import com.alipay.global.api.response.aps.customs.AlipayApsInquireDeclarationResponse;

import java.util.List;

public class AlipayApsInquireDeclarationRequest extends AlipayRequest<AlipayApsInquireDeclarationResponse> {
    private List<String> declarationRequestIds;

    public List<String> getDeclarationRequestIds() {
        return declarationRequestIds;
    }

    public AlipayApsInquireDeclarationRequest setDeclarationRequestIds(List<String> declarationRequestIds) {
        this.declarationRequestIds = declarationRequestIds;
        return this;
    }

    @Override
    public Class<AlipayApsInquireDeclarationResponse> getResponseClass() {
        return AlipayApsInquireDeclarationResponse.class;
    }
}
