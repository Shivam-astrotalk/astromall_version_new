package com.springastrotalk.astrotalk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.springastrotalk.astrotalk.entities.Product;
import com.springastrotalk.astrotalk.services.ProductService;


@RestController



public class MyController {
	
	@Autowired
	private ProductService productservice;
	
	@GetMapping("/astromall")
	public String astromall() {
		return "this is the astromal home page";
	}
	
	// to get all  the products
	@GetMapping("/products")
	public List<Product> getProducts(){
		
		
		return  this.productservice.getProducts();
		
		
	}
	
	
	@GetMapping("/products/{productId}")
	public Product getProduct(@PathVariable String productId) {
		return this.productservice.getProduct(Long.parseLong(productId));
	}
	
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product ) {
		return this.productservice.addProduct(product);
	}

}
