package com.example.single.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SingleEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingleEurekaServerApplication.class, args);
	}

}
