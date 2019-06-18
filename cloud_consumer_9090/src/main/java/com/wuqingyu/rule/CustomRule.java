package com.wuqingyu.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：wuqy
 * @date ：Created in 2019/6/12 13:41
 * @description：
 * @modified By：
 * @version:
 */

/**
 * 自定义配置类不能放在@ComponentScan所扫描的当前包下以及子包下，
 *  否则我们自定义的这个配置类就会被所有的Ribbon客户端所共享，也就是说
 *  我们达不到特殊化定制的目的了。
 */
@Configuration
public class CustomRule {

    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}
