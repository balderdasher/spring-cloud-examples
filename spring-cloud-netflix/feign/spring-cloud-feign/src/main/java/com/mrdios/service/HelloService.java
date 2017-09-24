package com.mrdios.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 通过Feign使用注解调用Rest微服务
 *
 * @author mrdios
 * @date 2017-09-24
 */
@FeignClient(value = "service-hi")
public interface HelloService {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHi(@RequestParam("name") String name);
}
