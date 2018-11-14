package com.wzzm.collect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CollectApplication {
    protected static final Logger logger = LoggerFactory.getLogger(CollectApplication.class);
    public static void main(String[] args) {
        logger.info("SpringBoot开始加载");
        SpringApplication.run(CollectApplication.class, args);
        logger.info("SpringBoot加载完毕");
    }
}
