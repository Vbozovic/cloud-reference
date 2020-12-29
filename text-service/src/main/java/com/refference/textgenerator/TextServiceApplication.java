package com.refference.textgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TextServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TextServiceApplication.class, args);
	}

}
