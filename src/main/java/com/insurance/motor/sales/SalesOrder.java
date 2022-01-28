package com.insurance.motor.sales;

import java.util.List;

import com.insurance.motor.product.Product;

public class SalesOrder {

	public int orderID;
	public String orderName;
	public String orderDate;
	public String customerName;
	public int customerID;
	public int orderTotal;
	public List<Product> products;

	public SalesOrder(int orderID, String orderName, String orderDate, String customerName, int customerID,
			int orderTotal, List<Product> products) {
		this.orderID = orderID;
		this.orderName = orderName;
		this.orderDate = orderDate;
		this.customerName = customerName;
		this.customerID = customerID;
		this.orderTotal = orderTotal;
		this.products = products;
	}
}
