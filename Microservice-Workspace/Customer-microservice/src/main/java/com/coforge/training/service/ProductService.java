//package com.coforge.training.service;
//
//import java.util.Date;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.HttpMethod;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.client.RestTemplate;
//
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
//
//@Service
//public class ProductService{
//	
//	@Autowired
//	private RestTemplate restTemplate;
//
//	@Bean
//	public RestTemplate restTemplate() {
//		return new  RestTemplate();
//		
//	}
//	
//	@HystrixCommand(fallbackMethod= "CallProduct_data")
//	public String CallProduct(Long id) {
//		
//		System.out.println("Getting Product Details: "+id);
//		
//		String response = restTemplate.exchange("http://localhost:8765/product/{id}"
//						, HttpMethod.GET
//						, null
//						, new ParameterizedTypeReference<String>() {
//						}, id).getBody();
//				
//		System.out.println("Response Received as " + response + " - " + new Date());
//
//		return "NORMAL FLOW !!! - Product Details - " + id + " ::: " +
//		" Candidate Details " + response + " - " + new Date();
//	}
//	
//	@SuppressWarnings("unused")
//	private String CallProduct_data(Long id) {
//		System.out.println("Candidate Service is down!!! fallback route enabled...");
//		return "CIRCUIT BREAKER ENABLED!!! No Response From Candidate Service at this moment. " +
//		" Service will be back shortly - " + new Date();
//	}
//}