package com.wuqingyu.cloud_consumer_9090.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：wuqy
 * @date ：Created in 2019/6/9 0:54
 * @description：Rest配置类
 * @modified By：
 * @version: $
 */
@Configuration
public class RestConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        SimpleClientHttpRequestFactory simpleClientHttpRequestFactory  = new SimpleClientHttpRequestFactory ();
        simpleClientHttpRequestFactory.setConnectTimeout(50000);
        simpleClientHttpRequestFactory.setReadTimeout(50000);
        return new RestTemplate(simpleClientHttpRequestFactory);
    }

    /**
     * 定义 负载均衡策略
     * RoundRobinRule
     *   轮询
     * RandomRule
     *   随机
     * AvailabilityFilteringRule
     *   会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务， 还有并发的连接数量超过阈值的服务，然后对剩余的服务列表按照轮询策略进行访问
     * WeightedResponseTimeRule
     *   根据平均响应时间计算所有服务的权重，响应时间越快服务权重越大被选中的概率越高。 刚启动时如果统计信息不足，则使用RoundRobinRule策略，等统计信息足够， 会切换到WeightedResponseTimeRule
     * RetryRule
     *   先按照RoundRobinRule的策略获取服务，如果获取服务失败则在指定时间内会进行重试，获取可用的服务
     * BestAvailableRule
     *   会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，然后选择一个并发量最小的服务
     * ZoneAvoidanceRule
     *   默认规则,复合判断server所在区域的性能和server的可用性选择服务器
     * @return
     */
   /* @Bean
    public IRule iRule(){
        return new RandomRule();
    }*/
}
