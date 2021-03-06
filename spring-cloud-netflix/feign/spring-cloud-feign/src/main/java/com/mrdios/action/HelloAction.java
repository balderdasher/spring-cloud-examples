package com.mrdios.action;

import com.mrdios.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mrdios
 * @date 2017-09-24
 */
@RestController
public class HelloAction {
    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return helloService.sayHi(name);
    }
}
