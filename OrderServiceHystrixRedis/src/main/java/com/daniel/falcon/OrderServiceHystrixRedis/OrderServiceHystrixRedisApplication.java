package com.daniel.falcon.OrderServiceHystrixRedis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class OrderServiceHystrixRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceHystrixRedisApplication.class, args);
	}
}
