package com.zhaoxianglong.dubbo.entity;

import java.io.Serializable;

public class DemoEntity implements Serializable {
    private static final long serialVersionUID = 42L;


    private int id;

    private String user;

    private int age;

    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
