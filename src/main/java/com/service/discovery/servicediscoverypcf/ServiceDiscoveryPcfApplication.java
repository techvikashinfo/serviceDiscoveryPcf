package com.service.discovery.servicediscoverypcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceDiscoveryPcfApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryPcfApplication.class, args);
	}

}
