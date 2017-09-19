package com.mrdios;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring cloud 配置客户端：返回从配置服务器读取的配置
 */
@SpringBootApplication
@RestController
public class ConfigClient {

    @Value("${config.info.author}")
    String author;

    @RequestMapping("/hi")
    public String hi(){
        return author;
    }

    public static void main(String[] args){
        SpringApplication.run(ConfigClient.class);
    }
}
