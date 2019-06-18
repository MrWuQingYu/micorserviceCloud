package com.wuqingyu.cloud_provier_hystrix.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：wuqy
 * @date ：Created in 2019/6/13 14:58
 * @description：
 * @modified By：
 * @version:
 */
@RestController
public class DeptController {


    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    //一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    //@HystrixCommand(fallbackMethod = "processHystrixGet")
    public String get(@PathVariable("id") String id) {
        if (id.equals("5")) {
            throw new NullPointerException();
        } else {
            return "Hello " + id;
        }
    }

    public String processHystrixGet(@PathVariable("id") String id) {
        return "id=" + id + "的数据不存在";
    }
}
