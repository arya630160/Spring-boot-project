package com.web1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web1.Repository.ProductRepo;
import com.web1.model.Product;

@Service
public class ProductServiceImp implements  ProductService {

	
	@Autowired ProductRepo repo;
	@Override
	public Product saveProduct(Product product) {
		// BUSINESS LOGIC 
		double tot=0.0,dis=0.0,gamt=0.0,invoice=0.0;
		tot=product.getPrice()*product.getQuantity();
		if(tot<5000)
		{
			dis=(tot*15)/100;
		}
		else if(tot>=5000 && tot<40000)
		{
			dis=(tot*25)/100;
		}
		else if(tot>=40000)
		{
			dis=(tot*33)/100;
		}
		gamt=(tot*18)/100;
		invoice=(tot-dis)+gamt;
		product.setTotal(tot);
		product.setDiscount(dis);
		product.setGst(gamt);
		product.setInvoice_bill(invoice);
		
		return repo.save(product);
	}
	@Override
	public List<Product> getAllProduct() {
		List<Product> listOfAllProducts=repo.findAll();
		return listOfAllProducts;
	}
	@Override
	public void deleteProduct(int pid) {
		repo.deleteById(pid);
	}
	@Override
	public Product getOneProduct(int pid) {
		Product get=repo.findById(pid).get();
		return get;
	}

	@Override
	public Product updateProduct(Product product) {
		
		double tot=0.0,dis=0.0,gamt=0.0,invoice=0.0;
		tot=product.getPrice()*product.getQuantity();
		if(tot<5000)
		{
			dis=(tot*15)/100;
		}
		else if(tot>=5000 && tot<40000)
		{
			dis=(tot*25)/100;
		}
		else if(tot>=40000)
		{
			dis=(tot*33)/100;
		}
		gamt=(tot*18)/100;
		invoice=(tot-dis)+gamt;
		product.setTotal(tot);
		product.setDiscount(dis);
		product.setGst(gamt);
		product.setInvoice_bill(invoice);
		
		return repo.save(product);
	}
}
