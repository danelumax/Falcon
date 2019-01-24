package com.daniel.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages={"com.daniel.rest"}) // 扫描该包路径下的所有spring组件
@EnableJpaRepositories("com.daniel.rest.dao") // JPA扫描该包路径下的Repositorie
@EntityScan("com.daniel.rest.model") // 扫描实体类
@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

}

