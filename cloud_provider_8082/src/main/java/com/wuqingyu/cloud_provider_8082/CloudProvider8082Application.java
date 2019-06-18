package com.wuqingyu.cloud_provider_8082;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudProvider8082Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProvider8082Application.class, args);
    }

}
