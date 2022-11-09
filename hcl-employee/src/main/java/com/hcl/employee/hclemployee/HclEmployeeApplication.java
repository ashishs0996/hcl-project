package com.hcl.employee.hclemployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HclEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HclEmployeeApplication.class, args);
	}

}
