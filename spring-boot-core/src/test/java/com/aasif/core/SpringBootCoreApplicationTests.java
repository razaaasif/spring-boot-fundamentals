package com.aasif.core;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aasif.core.services.PaymentService;

@SpringBootTest
class SpringBootCoreApplicationTests {
	@Autowired
	private PaymentService paymentService;

	@Test
	void testDependencyInjection() {
		assertNotNull(paymentService);

	}
	
	@Test
	void testSumCalculate() {
		assertEquals(10, paymentService.calculateSum(5, 5));
	}

}
