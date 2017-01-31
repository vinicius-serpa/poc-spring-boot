package com.vinicius_serpa.poc_spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vinicius_serpa.poc_spring_boot.repository.Products;

@Controller
public class ProductsController {

	@Autowired
	private Products products;
	
	@GetMapping("/products")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("ProductList");
		modelAndView.addObject("products", products.findAll());
		return modelAndView;
	}
	
}
