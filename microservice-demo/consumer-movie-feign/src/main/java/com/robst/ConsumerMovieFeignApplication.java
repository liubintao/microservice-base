package com.robst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by liubintao on 2017/6/13.
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class ConsumerMovieFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMovieFeignApplication.class, args);
    }
}
