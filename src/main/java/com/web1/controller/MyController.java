package com.web1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web1.model.Product;
import com.web1.service.ProductServiceImp;

@Controller
public class MyController {

	@Autowired private ProductServiceImp service;

	@RequestMapping("/")
	public String homePage() {
		return "home";
	}
	@RequestMapping("/register")
	public String productForm()
	{
		return "pregister";
		
	}
	@RequestMapping("/save")
	public String addNewProductDetails(Product product,ModelMap model)
	{
		Product saveOneProduct=service.saveProduct(product);
		return "success";
	}
	@RequestMapping("/viewproducts")
	public String displayAllProductDetails(ModelMap model)
	{
		model.put("products", service.getAllProduct());
		
		return "viewproduct";
	}
	@RequestMapping("/delete/{pid}")
	public String deleteRecord(@PathVariable int pid)
	{
		service.deleteProduct(pid);
		return "redirect:/viewproducts";
	}
	@RequestMapping("/edit/{pid}")
	public String editForm(@PathVariable int pid,ModelMap model)
	{
		model.put("command", service.getOneProduct(pid));
		return "editproduct";
		
	}
	@RequestMapping("/editandsave")
	public String editAndSave(Product product,ModelMap model)
	{
		service.updateProduct(product);
		return "redirect:/viewproducts";
	}
}
