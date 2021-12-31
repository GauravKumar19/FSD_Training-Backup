package com.coforge.training;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//Once you have this Load balanced restTemplate instance then you can 
//use the logical name of the service, in the URL, that was used to register it with Eureka.
@Configuration
public class Config {

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		
		return new RestTemplate();
	}
}
