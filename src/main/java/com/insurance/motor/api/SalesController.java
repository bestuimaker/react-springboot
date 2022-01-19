package com.insurance.motor.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SalesController {
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/sales")
	public List<SalesOrder> GetAllSalesOrder() {
		List<SalesOrder> salesOrders = List.of(
				new SalesOrder("6540012121", "Food Delivery", "20122022", "Bhagwati", "Bhag0987", "350", "Cupcake")
		);
		return salesOrders;
	}
}
