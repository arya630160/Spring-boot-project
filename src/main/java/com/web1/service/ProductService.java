package com.web1.service;

import java.util.List;

import com.web1.model.Product;

public interface ProductService {

	public Product saveProduct(Product product);
	public Product updateProduct(Product product);
	public Product getOneProduct(int pid);
	public void deleteProduct(int pid);
	public List<Product> getAllProduct();
	
}
