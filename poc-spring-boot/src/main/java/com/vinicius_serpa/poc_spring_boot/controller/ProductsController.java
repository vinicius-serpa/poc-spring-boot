package com.vinicius_serpa.poc_spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductsController {

	@GetMapping("/products")
	public String list() {
		return "ProductList";
	}
	
}
