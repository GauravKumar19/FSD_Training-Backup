package com.coforge.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

// Micro-services communicate with feign client
/*Feign client is a wrapper library for http communications between micro services. 
 * Feign makes the developer life easier using declarative annotations avoiding to write the duplicate lines of code.
 */

@EnableEurekaClient
@EnableFeignClients /*With this annotation, we enable component scanning for interfaces that declare they are Feign clients.*/
@SpringBootApplication
public class MyuserMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyuserMicroserviceApplication.class, args);
	}

}
