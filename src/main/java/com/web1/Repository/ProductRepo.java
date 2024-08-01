package com.web1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web1.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

	
}
