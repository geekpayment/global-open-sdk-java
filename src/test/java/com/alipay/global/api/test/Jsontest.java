package com.alipay.global.api.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alipay.global.api.model.aps.PaymentFactor;
import org.junit.Test;

public class Jsontest {
    @Test
    public void test(){
        PaymentFactor factor = new PaymentFactor();
        factor.setIsInStorePayment(true);
        System.out.println(JSON.toJSONString(factor, SerializerFeature.WriteNonStringValueAsString));
    }
}
