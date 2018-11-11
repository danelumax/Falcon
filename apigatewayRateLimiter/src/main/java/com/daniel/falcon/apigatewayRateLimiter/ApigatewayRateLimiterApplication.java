package com.daniel.falcon.apigatewayRateLimiter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ApigatewayRateLimiterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigatewayRateLimiterApplication.class, args);
	}
}
