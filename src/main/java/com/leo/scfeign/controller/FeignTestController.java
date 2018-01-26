package com.leo.scfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.leo.scfeign.RestResponse;
import com.leo.scfeign.service.EurekaClientConsume;

/**
 * Created by leo on 2018/1/22.
 * Description:
 */
@RestController
public class FeignTestController {
    @Autowired
    private EurekaClientConsume eurekaClientConsume;


    @GetMapping("/test")
    public RestResponse test() {
        return eurekaClientConsume.testClient();
    }
}
