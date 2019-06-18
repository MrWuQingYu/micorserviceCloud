package com.wuqingyu.cloud_provider_8080.controller;

import com.wuqingyu.cloud.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：wuqy
 * @date ：Created in 2019/6/9 0:02
 * @description：部门Controller
 * @modified By：
 * @version: 1.0$
 */
@RestController
public class DeptController {

   /* @Autowired
    private DiscoveryClient discoveryClient;*/

    @GetMapping("/getAll")
    public List<Dept> getAll() {
        List<Dept> depts = new ArrayList<>();
        depts.add(new Dept("1", "詹三", "10"));
        depts.add(new Dept("2", "李四", "20"));
        depts.add(new Dept("3", "王五", "30"));
        return depts;
    }

  /*  @GetMapping("add")
    public void get() {

        List<ServiceInstance> cloud_provider = discoveryClient.getInstances("cloud_provider");
        for (ServiceInstance serviceInstance : cloud_provider) {
            System.out.println(serviceInstance.getInstanceId());
        }
    }*/
}
