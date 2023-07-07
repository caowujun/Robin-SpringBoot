package com.example.robinspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author P0164442
 */
@SpringBootApplication
@MapperScan("com.example.robinspringboot.mapper")
public class RobinSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RobinSpringBootApplication.class, args);
    }

}
