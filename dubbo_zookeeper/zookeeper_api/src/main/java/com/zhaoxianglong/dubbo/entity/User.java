package com.zhaoxianglong.dubbo.entity;

//import lombok.Data;

import java.io.Serializable;

/**
 * @program: dubbo
 * @description: user实体类
 * @author: zhaoxianglong
 * @create: 2021-01-15 10:10
 **/
//@Data
public class User implements Serializable {

    private Long serialVersionUID = 1L;


    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
