package com.wzzm.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class OrderApplication {
    protected static final Logger logger = LoggerFactory.getLogger(OrderApplication.class);
    public static void main(String[] args) {
        logger.info("SpringBoot开始加载");
        SpringApplication.run(OrderApplication.class, args);
        logger.info("SpringBoot加载完毕");
    }
}
