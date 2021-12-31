package com.coforge.training;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/*In order to implement Circuit Breaker in your application/microservice, you need to apply
 * @EnableHystrix at the main class of your application.
 * To see the analytics provided by Hystrix as a dashboard, apply @EnableHystrixDashboard at 
 * the main class. 
*/

//By default Circuit is Closed
//Client sends the service request when the circuit is closed - Normal
@EnableEurekaClient
@EnableHystrixDashboard
@EnableHystrix
@SpringBootApplication
public class CollegeMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeMicroserviceApplication.class, args);
	}



}