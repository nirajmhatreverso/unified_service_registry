package com.vai.unified.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UnifiedServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnifiedServiceRegistryApplication.class, args);
	}

}
