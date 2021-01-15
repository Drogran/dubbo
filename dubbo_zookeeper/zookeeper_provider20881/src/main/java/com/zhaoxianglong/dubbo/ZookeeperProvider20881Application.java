package com.zhaoxianglong.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhaoxianglong
 */
@SpringBootApplication
@EnableDubbo
public class ZookeeperProvider20881Application {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperProvider20881Application.class, args);
    }

}
