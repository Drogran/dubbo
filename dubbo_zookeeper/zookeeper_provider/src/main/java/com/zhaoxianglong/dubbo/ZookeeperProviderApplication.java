package com.zhaoxianglong.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhaoxianglong
 */
@SpringBootApplication
@EnableDubbo
public class ZookeeperProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperProviderApplication.class, args);
    }

}
