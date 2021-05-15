package com.javadeveloperzone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // Indicate Eureka Server Application
public class EurekaServerApplication {
    public static void main(String[] args)  {
        SpringApplication.run(EurekaServerApplication.class, args);            // it wil start application
    }
}
