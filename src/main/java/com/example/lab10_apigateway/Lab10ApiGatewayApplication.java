package com.example.lab10_apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class Lab10ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab10ApiGatewayApplication.class, args);
    }

}
