package com.coforge.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.model.Product;
import com.coforge.training.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService pService;
	
	
	//Get All Products
	@GetMapping(value = "getAllProduct")
	public List<Product> getProducts(){
		return pService.getAllProduct();
	}
	
	//Save Products
	@PostMapping(value= "saveProduct")
	public Product saveProduct(@RequestBody Product product){
		 pService.saveProduct(product);
		return product;
	}
	//Update Products
	@PutMapping("updateProduct")
	public Product updateProduct(@RequestBody Product product){
		return pService.updateProduct(product);
	}
	
	//Retreive Products By ID
	@GetMapping("/{productId}")
	public Optional<Product> getProductById(@PathVariable("productId") Long productId){
		return pService.getProductById(productId);
	}
	
	//Delete Products By Id
	@GetMapping(value = "deleteProductById/{productId}")
	public String deleteProductById(@PathVariable Long productId){
	pService.deleteProductById(productId);
	return"Product Deleted";
	}
	
}
