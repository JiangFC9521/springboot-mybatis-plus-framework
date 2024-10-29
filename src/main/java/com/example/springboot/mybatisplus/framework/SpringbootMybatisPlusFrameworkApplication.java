package com.example.springboot.mybatisplus.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ServletComponentScan
@EnableAsync
@EnableScheduling
public class SpringbootMybatisPlusFrameworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisPlusFrameworkApplication.class, args);
    }

}
