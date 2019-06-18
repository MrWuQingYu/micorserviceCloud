package com.wuqingyu.cloud_hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class CloudHystrixdashboard_9092Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudHystrixdashboard_9092Application.class, args);
    }

}
