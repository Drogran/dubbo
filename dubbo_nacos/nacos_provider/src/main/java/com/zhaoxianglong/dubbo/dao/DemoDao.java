package com.zhaoxianglong.dubbo.dao;

import com.zhaoxianglong.dubbo.entity.DemoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface DemoDao {
    int insertDemo(DemoEntity entity);

    int updateDemo(DemoEntity entity);

    int deleteDemo(int id);

    DemoEntity findById(int id);

    List<DemoEntity> findList();
}
