package com.insurance.motor.product;

public class Product {
	
	public int productID;
	public String productName;
	public int productQuantity;
	
	public int getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public Product(int productID, String productName, int productQuantity) {
		this.productID = productID;
		this.productName = productName;
		this.productQuantity = productQuantity;
	}
	
}
