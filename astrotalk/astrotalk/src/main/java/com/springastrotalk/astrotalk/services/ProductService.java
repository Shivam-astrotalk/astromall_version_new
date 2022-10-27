package com.springastrotalk.astrotalk.services;

import java.util.List;

import com.springastrotalk.astrotalk.entities.Product;

public interface ProductService {


	public List<Product> getProducts();
	public Product getProduct(long productId);
	public  Product addProduct(Product product);

}
