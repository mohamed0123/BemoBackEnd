package com.bemo.BemoBackEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication

@EntityScan(basePackages = { "com.bemo.BemoBackEnd.dto" })
@ComponentScan(basePackages = { "com.bemo.BemoBackEnd.api" })
@EnableMongoRepositories(basePackages = { "com.bemo.BemoBackEnd.repo" })
public class BemoBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(BemoBackEndApplication.class, args);
	}

}
