package com.javadeveloperzone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootConfig {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfig.class, args);            // it wil start application
    }
}
