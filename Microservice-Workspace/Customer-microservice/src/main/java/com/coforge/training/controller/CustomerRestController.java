package com.coforge.training.controller;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.client.RestTemplate;

import com.coforge.training.model.Product;
import com.coforge.training.service.CustomerService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
	
	private Logger log = LoggerFactory.getLogger(CustomerRestController.class);
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Bean
	public RestTemplate restTemplate() {
		return new  RestTemplate();
			}
	
	@GetMapping("getAllProduct")
	public List<Product> getProductInfo() {
		
		log.info("Inside Item Microservice");
		return customerService.getProducts();
	}
	
	@GetMapping("/getOneProduct/{id}")

	public Optional<Product> getOneProduct(@PathVariable Long id) {
		
		return customerService.getProductById(id);
	}
	
	
	@PostMapping("/saveProduct")
	public Product save(@RequestBody Product product) {
		
		return customerService.saveProduct(product);
	}
	
	@PutMapping("/updateProduct")
	public Product update(@RequestBody Product product) {
		
		return customerService.updateProduct(product);
	}
	
	@GetMapping("/deleteProductById/{productId}")
		public String delete(@PathVariable Long productId) {
		 customerService.deleteProductById(productId);
		 return"Product Deleted Successfully";
		
	}
	
	@HystrixCommand(fallbackMethod = "service_fallback")
	@GetMapping("/getProducts")
	public String getProducts1(){
		
		String response = restTemplate.getForObject("http://localhost:8765/product/getAllProduct",String.class);
		
		return response;
		
	}
	
	public String service_fallback(){
		
		return "Circuit GateWay Failed!!!!";
	}
	
	}

