package com.wuqingyu.cloud_server_7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudServer7001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudServer7001Application.class, args);
    }

}
