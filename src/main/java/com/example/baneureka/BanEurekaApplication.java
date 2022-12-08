package com.example.baneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BanEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BanEurekaApplication.class, args);
	}

}
