package com.insurance.motor.sales;

import java.util.List;

import com.insurance.motor.product.Product;

public class SalesOrderRepository {
	public static SalesOrder orderone = new SalesOrder(
			3232, 
			"Food Delivery",
			"20122022", 
			"Bhagwati", 
			12345, 
			350, 
			List.of(
					new Product 
					(12454, "Cup Cake", 2),
					new Product 
					(12434, "Milk Cake", 1)
					)
			);
	public static SalesOrder ordertwo = new SalesOrder(
			1234, 
			"Food Delivery", 
			"20122022", 
			"Bhagwati", 
			4563, 
			350, 
			List.of(
					new Product 
					(12454, "Sandwitch", 2),
					new Product 
					(12434, "Banana Shake", 1)
					)
			);
	
	public static List<SalesOrder> getAllSalesOrders() {
		return List.of(orderone, ordertwo);
	}


}
