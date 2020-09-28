package com.rin.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 1. 导入依赖
 *      a 导入dubbo-starter
 *      b 导入dubbo的其他依赖服务降级
 * */
@EnableDubbo // 开启基于注解的dubbo功能
@SpringBootApplication
public class BootUserServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceProviderApplication.class, args);
    }

}
