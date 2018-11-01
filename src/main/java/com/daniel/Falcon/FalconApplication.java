package com.daniel.Falcon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FalconApplication {

	public static void main(String[] args) {
		SpringApplication.run(FalconApplication.class, args);
	}
}
