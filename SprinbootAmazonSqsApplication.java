package com.springboot.amazonsqs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.amazonsqs.*")
public class SprinbootAmazonSqsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinbootAmazonSqsApplication.class, args);
	}

}
