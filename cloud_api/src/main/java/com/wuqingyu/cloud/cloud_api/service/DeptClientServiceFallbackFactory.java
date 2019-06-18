package com.wuqingyu.cloud.cloud_api.service;

import com.wuqingyu.cloud.cloud_api.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ：wuqy
 * @date ：Created in 2019/6/13 16:38
 * @description：
 * @modified By：
 * @version:
 */
@Component // 不要忘记添加，不要忘记添加
// 服务降级发生在客户端  熔断发生在服务端
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public List<Dept> getAll() {
                return null;
            }

            @Override
            public String get(String id) {
                return "该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭";
            }
        };
    }
}
