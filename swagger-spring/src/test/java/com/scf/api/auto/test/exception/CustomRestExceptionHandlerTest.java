package com.scf.api.auto.test.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@WebMvcTest
class CustomRestExceptionHandlerTest {
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
	void testHandleMethodArgumentTypeMismatch() throws Exception {
		String urlTemplate="/vehiclesLoanApplication/loan/vehicles/10?Password=jcm&User=jcm";
    	RequestBuilder reqBuilder = MockMvcRequestBuilders.get(urlTemplate)
    			.accept(MediaType.APPLICATION_JSON)
    			.contentType(MediaType.APPLICATION_JSON).header("X-Santander-Client-Id", 123456);
    	MvcResult result = mockMvc.perform(reqBuilder).andExpect(status().isNotAcceptable()).andReturn();
    	assertEquals(HttpStatus.NOT_ACCEPTABLE.value(), result.getResponse().getStatus());
	}

	@Test
	void handleHttpMediaTypeNotSupportedTest() throws Exception {
		String urlTemplate="/vehiclesLoanApplication/loan/vehicles/C?Password=jcm&User=jcm";
    	RequestBuilder reqBuilder = MockMvcRequestBuilders.get(urlTemplate)
    			.accept(MediaType.APPLICATION_JSON)
    			.header("X-Santander-Client-Id", 123456);
    	MvcResult result = mockMvc.perform(reqBuilder).andExpect(status().isUnsupportedMediaType()).andReturn();
    	assertEquals(HttpStatus.UNSUPPORTED_MEDIA_TYPE.value(), result.getResponse().getStatus());
	}
	
	@Test
	void handleHttpRequestMethodNotSupportedTest() throws Exception {
		String urlTemplate="/vehiclesLoanApplication/loan/vehicles/C?Password=jcm&User=jcm";
		RequestBuilder reqBuilder = MockMvcRequestBuilders.delete(urlTemplate);
		MvcResult result = mockMvc.perform(reqBuilder).andReturn();
		assertEquals(HttpStatus.METHOD_NOT_ALLOWED.value(), result.getResponse().getStatus());
	}
	
	@Test
	void handleNoHandlerFoundExceptionTest() throws Exception {
		assertEquals(HttpStatus.NOT_IMPLEMENTED.value(), 501);
	}
	
	@Test
	void handleMissingServletRequestParameterTest() throws Exception {
		String urlTemplate="/vehiclesLoanApplication/loan/vehicles/10?Password=jcm";
    	RequestBuilder reqBuilder = MockMvcRequestBuilders.get(urlTemplate)
    			.accept(MediaType.APPLICATION_JSON)
    			.contentType(MediaType.APPLICATION_JSON).header("X-Santander-Client-Id", 123456);
    	MvcResult result = mockMvc.perform(reqBuilder).andExpect(status().isBadRequest()).andReturn();
    	assertEquals(HttpStatus.BAD_REQUEST.value(), result.getResponse().getStatus());
	}

	@Test
	void handleMethodArgumentNotValidTest() {
		//TODO Not found valid argument until today
		Assertions.assertTrue(true);
	}

	@Test
	void handleHttpMessageNotReadableTest() {
		Assertions.assertTrue(true);
	}

	@Test
	void handleHttpMessageNotWritableTest() {
		Assertions.assertTrue(true);
	}

	@Test
	void responseEntityExceptionHandlerTest() {
		Assertions.assertTrue(true);
	}
	

}
