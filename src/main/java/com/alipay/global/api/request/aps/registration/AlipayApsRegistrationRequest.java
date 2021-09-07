package com.alipay.global.api.request.aps.registration;

import com.alipay.global.api.model.aps.MerchantRegistrationInfo;
import com.alipay.global.api.model.aps.ProductCodeType;
import com.alipay.global.api.model.aps.StoreRegistrationInfo;
import com.alipay.global.api.request.AlipayRequest;
import com.alipay.global.api.response.aps.registeration.AlipayApsRegistrationResponse;

import java.util.List;

public class AlipayApsRegistrationRequest extends AlipayRequest<AlipayApsRegistrationResponse> {
    private String registrationRequestId;
    private MerchantRegistrationInfo merchantInfo;
    private StoreRegistrationInfo storeInfo;
    private List<ProductCodeType> productCodes;
    private String registrationNotifyUrl;
    private String passThroughInfo;

    public String getRegistrationRequestId() {
        return registrationRequestId;
    }

    public AlipayApsRegistrationRequest setRegistrationRequestId(String registrationRequestId) {
        this.registrationRequestId = registrationRequestId;
        return this;
    }

    public MerchantRegistrationInfo getMerchantInfo() {
        return merchantInfo;
    }

    public AlipayApsRegistrationRequest setMerchantInfo(MerchantRegistrationInfo merchantInfo) {
        this.merchantInfo = merchantInfo;
        return this;
    }

    public StoreRegistrationInfo getStoreInfo() {
        return storeInfo;
    }

    public AlipayApsRegistrationRequest setStoreInfo(StoreRegistrationInfo storeInfo) {
        this.storeInfo = storeInfo;
        return this;
    }

    public List<ProductCodeType> getProductCodes() {
        return productCodes;
    }

    public AlipayApsRegistrationRequest setProductCodes(List<ProductCodeType> productCodes) {
        this.productCodes = productCodes;
        return this;
    }

    public String getRegistrationNotifyUrl() {
        return registrationNotifyUrl;
    }

    public AlipayApsRegistrationRequest setRegistrationNotifyUrl(String registrationNotifyUrl) {
        this.registrationNotifyUrl = registrationNotifyUrl;
        return this;
    }

    public String getPassThroughInfo() {
        return passThroughInfo;
    }

    public AlipayApsRegistrationRequest setPassThroughInfo(String passThroughInfo) {
        this.passThroughInfo = passThroughInfo;
        return this;
    }

    @Override
    public Class<AlipayApsRegistrationResponse> getResponseClass() {
        return AlipayApsRegistrationResponse.class;
    }
}
