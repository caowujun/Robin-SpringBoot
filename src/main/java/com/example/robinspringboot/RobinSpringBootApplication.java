package com.example.robinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author P0164442
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class RobinSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RobinSpringBootApplication.class, args);
    }

}
