package com.javadeveloperzone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient         // To enable eureka client
public class EurekaClientConfig {
    public static void main(String[] args)  {
        SpringApplication.run(EurekaClientConfig.class, args);            // it wil start application
    }
}
