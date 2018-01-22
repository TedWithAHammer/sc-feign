package com.leo.scfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.leo.scfeign.RestResponse;
import com.leo.scfeign.service.EurekaClientConsum;

/**
 * Created by leo on 2018/1/22.
 * Description:
 */
@RestController
public class FeignTestController {
    @Autowired
    private EurekaClientConsum eurekaClientConsum;


    @GetMapping("/test")
    public RestResponse test() {
        return eurekaClientConsum.testClient();
    }
}
