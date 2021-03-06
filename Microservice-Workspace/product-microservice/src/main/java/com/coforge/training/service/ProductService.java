package com.coforge.training.service;

import java.util.List;
import java.util.Optional;

import com.coforge.training.model.Product;

public interface ProductService {

	//To get all products
	public List<Product> getAllProduct();
	
	//To save new Product
	public Product saveProduct(Product product);
	
	//To Update Product
	public Product updateProduct(Product product);
	
	//To Get Product By Id
	Optional<Product> getProductById(Long productId);
	
	//To delete Product
	public void deleteProductById(Long productId);
}
