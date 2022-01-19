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
		return SalesOrderService.GetAllSalesOrder();
	}
}
