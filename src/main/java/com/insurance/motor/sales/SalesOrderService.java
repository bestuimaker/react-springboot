package com.insurance.motor.sales;

import java.util.List;

public class SalesOrderService {

	public static List<SalesOrder> GetAllSalesOrder() {
		return SalesOrderRepository.getAllSalesOrders();
	}

	
}
