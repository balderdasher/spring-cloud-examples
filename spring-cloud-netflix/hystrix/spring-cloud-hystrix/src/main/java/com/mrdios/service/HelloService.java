package com.mrdios.service;

import com.mrdios.service.hystrix.HelloServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author mrdios
 * @date 2017-09-24
 */
@FeignClient(value = "service-hi",fallback = HelloServiceHystrix.class)
public interface HelloService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHello(@RequestParam("name") String name);
}
