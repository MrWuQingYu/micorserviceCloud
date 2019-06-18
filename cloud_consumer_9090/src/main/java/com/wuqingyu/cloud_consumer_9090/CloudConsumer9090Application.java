package com.wuqingyu.cloud_consumer_9090;

import com.wuqingyu.rule.CustomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
// 在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
@RibbonClient(name = "CLOUD-PROVIDER",configuration = CustomRule.class)
public class CloudConsumer9090Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumer9090Application.class, args);
    }

}
