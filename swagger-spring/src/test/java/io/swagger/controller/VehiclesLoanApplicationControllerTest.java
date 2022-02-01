package io.swagger.controller;


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
	
//	@Test
//	public void testDummy() throws Exception {
//		Mockito.when(vehicleService.dummyMethod()).thenReturn(new ResponseEntity<String>("Hola mundo", HttpStatus.OK));
////		
//		String urlTemplate="/vehiclesLoanApplication/loan/dummy";
////		
//		RequestBuilder reqBuilder = MockMvcRequestBuilders.get(urlTemplate)
//				.accept(MediaType.APPLICATION_JSON);
////		
////		 mockMvc.perform(reqBuilder)
////         .andExpect(status().isOk());
//		MvcResult result = mockMvc.perform(reqBuilder).andReturn();
//	 
//
//				System.out.println(result.getResponse());
//		String expected = "Hola mundo";
//
//		// {"id":"Course1","name":"Spring","description":"10 Steps, 25 Examples and 10K Students","steps":["Learn Maven","Import Project","First Example","Second Example"]}
//
//		JSONAssert.assertEquals(expected, result.getResponse()
//				.getContentAsString(), false);
//
//	}

}
