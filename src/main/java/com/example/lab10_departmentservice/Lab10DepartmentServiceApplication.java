package com.example.lab10_departmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Lab10DepartmentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab10DepartmentServiceApplication.class, args);
    }

}
