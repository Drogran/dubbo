package com.zhaoxianglong.dubbo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: dubbo
 * @description: user实体类
 * @author: zhaoxianglong
 * @create: 2021-01-15 10:10
 **/
@Data
public class User implements Serializable {

    private Integer id;
    private String name;
    private Integer age;
}
