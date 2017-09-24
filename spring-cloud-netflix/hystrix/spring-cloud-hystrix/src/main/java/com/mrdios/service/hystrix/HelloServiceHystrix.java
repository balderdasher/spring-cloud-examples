package com.mrdios.service.hystrix;

import com.mrdios.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * 断路器：当服务不可用时的执行的操作
 *
 * @author mrdios
 * @date 2017-09-24
 */
@Component
public class HelloServiceHystrix implements HelloService {
    private static final String SORRY = "sorry ";

    @Override
    public String sayHello(String name) {
        return SORRY + name;
    }
}
