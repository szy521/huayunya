package com.wzzm.naddress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class NaddressApplication {
    protected static final Logger logger = LoggerFactory.getLogger(NaddressApplication.class);
    public static void main(String[] args) {
        logger.info("SpringBoot开始加载");
        SpringApplication.run(NaddressApplication.class, args);
        logger.info("springBoot加载完毕");
    }
}
