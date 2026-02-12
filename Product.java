package com.java.Product;

import java.io.Serializable;

public class Product implements Serializable, Comparable<Product> {

	private int productId;
	private String productName;
	private double rating;
	private double price;

	public Product() {
	}

	public Product(int productId, String productName, double rating, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.rating = rating;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", rating=" + rating + ", price="
				+ price + "]";
	}

	@Override
	public int compareTo(Product o) {
		if (o == null)
			return 1;
		return Integer.compare(this.getProductId(), o.getProductId());
	}

}
