package com.insurance.motor.sales;

import java.util.List;

public class SalesOrder {

	public int OrderID;
	public String OrderName;
	public String OrderDate;
	public String CustomerName;
	public int CustomerID;
	public int OrderTotal;
	public List<Products> OrderItem;

	public SalesOrder(int orderID, String orderName, String orderDate, String customerName, int customerID,
			int orderTotal, List<Products> orderItem) {
		OrderID = orderID;
		OrderName = orderName;
		OrderDate = orderDate;
		CustomerName = customerName;
		CustomerID = customerID;
		OrderTotal = orderTotal;
		OrderItem = orderItem;
	}
}
