package com.wuqingyu.cloud_config_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudConfigProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigProviderApplication.class, args);
    }

}
