package com.hcl.salary.hclsalary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HclSalaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HclSalaryApplication.class, args);
	}

}
