package com.alipay.global.api.response.aps.customs;

import com.alipay.global.api.model.aps.DeclarationRecord;
import com.alipay.global.api.response.AlipayResponse;

import java.util.List;

public class AlipayApsInquireDeclarationResponse extends AlipayResponse {
    private List<String> declarationRequestsNotFound;
    private List<DeclarationRecord> declarationRecords;

    public List<String> getDeclarationRequestsNotFound() {
        return declarationRequestsNotFound;
    }

    public List<DeclarationRecord> getDeclarationRecords() {
        return declarationRecords;
    }
}
