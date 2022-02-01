package io.swagger.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import io.swagger.controller.VehiclesLoanApplicationApiController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class Swagger2SpringBootTest {
	@Autowired
	VehiclesLoanApplicationApiController vehiclesController;

	@Test
	void test() {
		Assertions.assertNotNull(vehiclesController);
	}

}
