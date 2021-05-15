package com.javadeveloperzone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient         // To enable eureka client
@EnableResourceServer
public class EurekaClientConfig {
    public static void main(String[] args)  {
        SpringApplication.run(EurekaClientConfig.class, args);            // it wil start application
    }

    @LoadBalanced
    @Bean(name = "tokenVerifier")
    public RestTemplate tokenVerifier(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }
}
