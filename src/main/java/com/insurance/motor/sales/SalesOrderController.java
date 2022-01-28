package com.insurance.motor.sales;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SalesOrderController {

	@GetMapping("/sales")	
	public List<SalesOrder> GetAllSalesOrder() {
		return SalesOrderService.GetAllSalesOrder();
	}
}
