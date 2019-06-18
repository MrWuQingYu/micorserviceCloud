package com.wuqingyu.cloud.cloud_api.service;

import com.wuqingyu.cloud.cloud_api.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "CLOUD-PROVIDER",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {


    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    List<Dept> getAll();

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    String get(@PathVariable("id") String id);

}
