package com.springastrotalk.astrotalk.entities;

public class Product {
	
	private long id;
	private String product_description;
	private String product_banner;
	private long product_price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(long id, String product_description, String product_banner, long product_price) {
		super();
		this.id = id;
		this.product_description = product_description;
		this.product_banner = product_banner;
		this.product_price = product_price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", product_description=" + product_description + ", product_banner="
				+ product_banner + ", product_price=" + product_price + "]";
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public String getProduct_banner() {
		return product_banner;
	}
	public void setProduct_banner(String product_banner) {
		this.product_banner = product_banner;
	}
	public long getProduct_price() {
		return product_price;
	}
	public void setProduct_price(long product_price) {
		this.product_price = product_price;
	}
	

}
