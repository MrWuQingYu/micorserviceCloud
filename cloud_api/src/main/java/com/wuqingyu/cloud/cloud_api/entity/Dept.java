package com.wuqingyu.cloud.cloud_api.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author ：wuqy
 * @date ：Created in 2019/6/8 23:47
 * @description：实体类
 * @modified By：
 * @version: 1.0$
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {

    private String id;
    private String name;
    private String age;
}
