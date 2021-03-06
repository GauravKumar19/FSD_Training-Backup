package com.coforge.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.training.model.Product;
import com.coforge.training.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo pRepo;

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return pRepo.findAll();
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return pRepo.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return pRepo.save(product);
	}

	@Override
	public Optional<Product> getProductById(Long productId) {
		// TODO Auto-generated method stub
		return pRepo.findById(productId);
	}

	@Override
	public void deleteProductById(Long productId) {
		// TODO Auto-generated method stub
		pRepo.deleteById(productId);
		
		
		
	}
}


