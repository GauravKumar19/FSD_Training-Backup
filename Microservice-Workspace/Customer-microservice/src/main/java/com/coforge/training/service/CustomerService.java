package com.coforge.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.coforge.training.model.Product;

@FeignClient(name="Product-service")
public interface CustomerService  {
	
	//Get All Products
	@GetMapping(value = "/product/getAllProduct")
	public List<Product> getProducts();
	
	//Save Products
	@PostMapping(value= "/product/saveProduct")
	public Product saveProduct(@RequestBody Product product);
	
	//Update Products
	@PutMapping("/product/updateProduct")
	public Product updateProduct(@RequestBody Product product);
	
	//Retreive Products By ID
	@GetMapping("/product/{productId}")
	public Optional<Product> getProductById(@PathVariable("productId") Long productId);
	
	//Delete Products By Id
	@GetMapping(value = "/product/deleteProductById/{productId}")
	public String deleteProductById(@PathVariable Long productId);
	
	
}
