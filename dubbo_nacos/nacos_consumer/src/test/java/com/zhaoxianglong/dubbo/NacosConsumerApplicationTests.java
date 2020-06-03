package com.zhaoxianglong.dubbo;

import com.zhaoxianglong.dubbo.controller.DemoController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NacosConsumerApplicationTests {

    @Autowired
    DemoController controller;

    @Test
    void contextLoads() {
        for (int i = 0; i < 10; i++)
            System.out.println(controller.getPort());
    }

}
