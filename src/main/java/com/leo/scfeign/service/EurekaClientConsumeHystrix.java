package com.leo.scfeign.service;

import org.springframework.stereotype.Component;
import com.leo.scfeign.RestResponse;

/**
 * Created by leo on 2018/1/26.
 * Description:
 */
@Component
public class EurekaClientConsumeHystrix implements EurekaClientConsume {
    @Override
    public RestResponse<String> testClient() {
        return new RestResponse<>(400, "接口暂不可用(FEIGN)", null);
    }
}
