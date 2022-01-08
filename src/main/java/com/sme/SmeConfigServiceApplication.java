package com.sme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SmeConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmeConfigServiceApplication.class, args);
	}

}
