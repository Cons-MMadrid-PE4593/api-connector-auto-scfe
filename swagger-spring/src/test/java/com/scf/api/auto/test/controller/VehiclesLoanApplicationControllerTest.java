package com.scf.api.auto.test.controller;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.scf.api.auto.controller.VehiclesLoanApplicationApiController;

@WebMvcTest(controllers =  VehiclesLoanApplicationApiController.class)
public class VehiclesLoanApplicationControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext context;
	
	@BeforeEach
	  public void setup() {
	    this.mockMvc = MockMvcBuilders
	      .webAppContextSetup(this.context)
	      .build();
	  }
		
    @Test
    public void testDummyMethod() throws Exception {
    	String urlTemplate="/vehiclesLoanApplication/loan/dummy";
    	RequestBuilder reqBuilder = MockMvcRequestBuilders.get(urlTemplate).accept(MediaType.APPLICATION_JSON);
    	MvcResult result = mockMvc.perform(reqBuilder).andExpect(status().isOk()).andReturn();
    	assertEquals("Hola mundo", result.getResponse().getContentAsString());
    }
    
    @Test
    public void getVehiclesByTypeTest() throws Exception {
    	String urlTemplate="/vehiclesLoanApplication/loan/dummy";
    	RequestBuilder reqBuilder = MockMvcRequestBuilders.get(urlTemplate).accept(MediaType.APPLICATION_JSON);
    	MvcResult result = mockMvc.perform(reqBuilder).andExpect(status().isOk()).andReturn();
    	assertEquals("Hola mundo", result.getResponse().getContentAsString());
    }

}
