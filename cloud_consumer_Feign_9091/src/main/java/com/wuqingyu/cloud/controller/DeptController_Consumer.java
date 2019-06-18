package com.wuqingyu.cloud.controller;

import com.wuqingyu.cloud.cloud_api.entity.Dept;
import com.wuqingyu.cloud.cloud_api.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ：wuqy
 * @date ：Created in 2019/6/9 0:50
 * @description：消费者
 * @modified By：
 * @version: 1.0$
 */
@RestController
public class DeptController_Consumer {

    @Autowired
    private RestTemplate restTemplate;

   /* @Autowired
    private DeptClientServices deptClientService;*/

    @Autowired
    private DeptClientService deptClientService;

    private static final String REST_URL_PREFIX = "http://CLOUD-PROVIDER";
   // private static final String REST_URL_PREFIX = "http://localhost:8080";


    @GetMapping("/getAll_consumer")
    public List<Dept> getAll() {
        return  restTemplate.getForObject(REST_URL_PREFIX + "/getAll", List.class);
    }

    @GetMapping("/getAll_consumer_Feign")
    public List<Dept> getAllFeign() {
        return  this.deptClientService.getAll();
    }

    @GetMapping("/get/{id}")
    public String get(@PathVariable("id") String id) {
        return  this.deptClientService.get(id);
    }
}
