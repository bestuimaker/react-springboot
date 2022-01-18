package com.insurance.motor.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesController {
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/sales")
	public Sales sales() {
		return new Sales();
	}

}
