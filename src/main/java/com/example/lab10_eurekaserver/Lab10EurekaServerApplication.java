package com.example.lab10_eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Lab10EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab10EurekaServerApplication.class, args);
	}

}
