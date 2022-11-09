package com.hcl.cloud.hclservicedescovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HclServiceDescoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HclServiceDescoveryApplication.class, args);
	}

}
