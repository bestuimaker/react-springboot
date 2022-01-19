package com.insurance.motor.api;

public class SalesOrder {

	public String OrderID;
	public String OrderName;
	public String OrderDate;
	public String CustomerName;
	public String CustomerID;
	public String OrderTotal;
	public String OrderItem;

	public SalesOrder(String orderID, String orderName, String orderDate, String customerName, String customerID,
			String orderTotal, String orderItem) {
		OrderID = orderID;
		OrderName = orderName;
		OrderDate = orderDate;
		CustomerName = customerName;
		CustomerID = customerID;
		OrderTotal = orderTotal;
		OrderItem = orderItem;
	}
	
	public String getOrderID() {
		return OrderID;
	}
	public String getOrderName() {
		return OrderName;
	}
	public String getOrderDate() {
		return OrderDate;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public String getCustomerID() {
		return CustomerID;
	}
	public String getOrderTotal() {
		return OrderTotal;
	}
	public String getOrderItem() {
		return OrderItem;
	}
	@Override
	public String toString() {
		return "SalesOrder [OrderID=" + OrderID + ", OrderName=" + OrderName + ", OrderDate=" + OrderDate + ", CustomerName="
				+ CustomerName + ", CustomerID=" + CustomerID + ", OrderTotal=" + OrderTotal + ", OrderItem="
				+ OrderItem + "]";
	}


}
