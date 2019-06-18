package com.wuqingyu.cloud_provider_8080;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
public class CloudProvider8080Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProvider8080Application.class, args);
    }

}
