package com.vinicius_serpa.poc_spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vinicius_serpa.poc_spring_boot.model.Product;
import com.vinicius_serpa.poc_spring_boot.repository.Products;

@Controller
@RequestMapping("/products")
public class ProductsController {

	@Autowired
	private Products products;
	
	@GetMapping
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("ProductList");
		modelAndView.addObject("products", products.findAll());
		
		modelAndView.addObject("product", new Product());
		
		return modelAndView;
	}
	
	@PostMapping
	public String salvar(Product product) {
		this.products.save(product);
		return "redirect:/products";
	}
	
}
