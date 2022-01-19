package com.insurance.motor.sales;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SalesOrderController {
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/sales")
	public List<SalesOrder> GetAllSalesOrder() {
		List<SalesOrder> salesOrders = List.of(
				new SalesOrder(
						3232, 
						"Food Delivery", 
						"20122022", 
						"Bhagwati", 
						12345, 
						350, 
						List.of(
								new Products 
								(12454, "Cup Cake", 2),
								new Products 
								(12434, "Milk Cake", 1)
								)
						),
				new SalesOrder(
						1234, 
						"Food Delivery", 
						"20122022", 
						"Bhagwati", 
						4563, 
						350, 
						List.of(
								new Products 
								(12454, "Sandwitch", 2),
								new Products 
								(12434, "Banana Shake", 1)
								)
						)
		);
		return salesOrders;
	}
}
