package com.zhaoxianglong.dubbo.service;

import com.zhaoxianglong.dubbo.entity.DemoEntity;

import java.util.List;

public interface DemoService {

    int insertDemo(DemoEntity entity);

    int updateDemo(DemoEntity entity);

    int deleteDemo(int id);

    DemoEntity findById(int id);

    List<DemoEntity> findList();

    String getPort();
}
