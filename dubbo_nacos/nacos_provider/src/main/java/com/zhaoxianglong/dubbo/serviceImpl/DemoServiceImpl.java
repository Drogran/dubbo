package com.zhaoxianglong.dubbo.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhaoxianglong.dubbo.dao.DemoDao;
import com.zhaoxianglong.dubbo.entity.DemoEntity;
import com.zhaoxianglong.dubbo.service.DemoService;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoDao demoDao;

    @Value("${server.port}")
    private String serverPort;

    @Override
    public int insertDemo(DemoEntity entity) {
        return demoDao.insertDemo(entity);
    }

    @Override
    public int updateDemo(DemoEntity entity) {
        return demoDao.updateDemo(entity);
    }

    @Override
    public int deleteDemo(int id) {
        return demoDao.deleteDemo(id);
    }

    @Override
    public DemoEntity findById(int id) {
        return demoDao.findById(id);
    }

    @Override
    public List<DemoEntity> findList() {
        return demoDao.findList();
    }

    @Override
    public String getPort() {
        return serverPort;
    }
}
