package com.wuqingyu.cloud_provier_hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//对hystrixR熔断机制的支持
@EnableCircuitBreaker
public class CloudProvider8083Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProvider8083Application.class, args);
    }

}
