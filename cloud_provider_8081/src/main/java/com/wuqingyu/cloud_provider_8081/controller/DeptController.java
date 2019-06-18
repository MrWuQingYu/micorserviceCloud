package com.wuqingyu.cloud_provider_8081.controller;


import com.wuqingyu.cloud.Dept;
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

    @GetMapping("/getAll")
    public List<Dept> getAll() {
        List<Dept> depts = new ArrayList<>();
        depts.add(new Dept("11", "詹三1", "10"));
        depts.add(new Dept("22", "李四2", "20"));
        depts.add(new Dept("33", "王五3", "30"));
        return depts;
    }
}
