package com.coforge.training.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coforge.training.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

	

}
