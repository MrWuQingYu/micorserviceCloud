package com.wuqingyu.cloud_config_eurake_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudConfigEurakeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigEurakeServerApplication.class, args);
    }

}
