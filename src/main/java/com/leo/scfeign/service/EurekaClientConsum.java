package com.leo.scfeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.leo.scfeign.RestResponse;

/**
 * Created by leo on 2018/1/22.
 * Description:
 */
@FeignClient(value = "eureka-client1")
public interface EurekaClientConsum {
    @GetMapping
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    RestResponse<String> testClient();
}
