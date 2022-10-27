package com.springastrotalk.astrotalk.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springastrotalk.astrotalk.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {

	
	
	List<Product> list;
	
	public  ProductServiceImpl() {

		 list = new ArrayList<>();
		 list.add(new Product(238,"Astromall_real_stones","product related to the career growth",5001));
		 list.add(new Product(390,"Atromall nazar suraksha kawach", "related to the nazar",1001));
		 
	}
	
	@Override
	public List<Product> getProducts() {
		
		return list;
	}

	@Override
	public Product getProduct(long productId) {
		// TODO Auto-generated method stub
		Product p= null;
		for(Product product : list) {
			if(product.getId()==productId) {
				p=product;
				break;
			}
		}
		return p;
	}

	@Override
	public Product addProduct(Product product) {
		list.add(product);
		return product;
	}

}
