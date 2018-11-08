package com.daniel.falcon.ProductOrderFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProductOrderFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductOrderFeignApplication.class, args);
	}
}
