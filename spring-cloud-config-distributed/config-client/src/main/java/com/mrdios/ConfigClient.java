package com.mrdios;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置客户端
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ConfigClient {
    @Value("${config.info.author}")
    private String author;

    @RequestMapping("/hi")
    public String hi() {
        return author;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient.class, args);
    }
}
