package com.poc.campaigninfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CampaignInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampaignInfoServiceApplication.class, args);
	}

}
