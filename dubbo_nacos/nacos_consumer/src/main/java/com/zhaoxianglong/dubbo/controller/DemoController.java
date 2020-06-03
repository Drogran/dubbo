package com.zhaoxianglong.dubbo.controller;


import com.zhaoxianglong.dubbo.entity.DemoEntity;
import com.zhaoxianglong.dubbo.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemoController {

    @Reference
    DemoService service;

    @PostMapping("/insertDemo")
    public int insertDemo(DemoEntity entity) {
        return service.insertDemo(entity);
    }

    @PostMapping("/updateDemo")
    public int updateDemo(DemoEntity entity) {
        return service.updateDemo(entity);
    }

    @DeleteMapping("/deleteDemo/{id}")
    public int deleteDemo(@PathVariable("id") int id) {
        return service.deleteDemo(id);
    }

    @GetMapping("/findList")
    public List<DemoEntity> findList() {
        return service.findList();
    }

    @GetMapping("/findById/{id}")
    public DemoEntity findById(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @GetMapping("/")
    public String getPort(){
        return service.getPort();
    }
}
