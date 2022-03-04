package com.scf.api.auto.controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.santander.giws.client.GetVehicles;
import com.santander.giws.client.GetVehiclesResponse;
import com.santander.giws.client.ObjectFactory;
import com.scf.api.auto.api.VehiclesLoanApplicationApi;
import com.scf.api.auto.model.giws.vehicles.VehiclesResponse;
import com.scf.api.auto.ws.giws.GiwsClient;

import io.swagger.annotations.ApiParam;


@Controller
@CrossOrigin (origins = "http://localhost:8080")
public class VehiclesLoanApplicationApiController implements VehiclesLoanApplicationApi {

    private static final Logger log = LoggerFactory.getLogger(VehiclesLoanApplicationApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    @Autowired
    GiwsClient giwsClient;

    @org.springframework.beans.factory.annotation.Autowired
    public VehiclesLoanApplicationApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }
    
	public ResponseEntity<VehiclesResponse> getVehicleByBrand(
//			@ApiParam(value = "include context object", required = true) @RequestHeader(value = "Context", required = true) String context,
//			@ApiParam(value = "Authorization token. Bearer OAuth2 token", required = true) @RequestHeader(value = "Authorization", required = true) String authorization,
			@ApiParam(value = "metadata content type", required = true, defaultValue = "application/json") @RequestHeader(value = "Content-Type", required = true, defaultValue = "application/json") String contentType,
			@ApiParam(value = "Client Id header", required = true) @RequestHeader(value = "X-Santander-Client-Id", required = true) String xSantanderClientId,
			@ApiParam(value = "The server response", required = true, defaultValue = "application/json") @RequestHeader(value = "Accept", required = true, defaultValue = "application/json") String accept,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "User", required = true) String user,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "Password", required = true) String password,
			@ApiParam(value = "C car, M moto", required = true) @PathVariable("VehicleType") Character vehicleType,
			@ApiParam(value = "", required = true) @PathVariable("ManufacturerId") String manufacturerId,
			@ApiParam(value = "Overall ID of the trace, shared by every span in the trace. The value is 64 or 128 bits long.") @RequestHeader(value = "X-B3-TraceId", required = false) String xB3TraceId,
			@ApiParam(value = "Position of the parent operation in the trace tree. The value is 64 bits long. value is omitted when the span is the root of the trace tree. ") @RequestHeader(value = "X-B3-ParentSpanId", required = false) String xB3ParentSpanId,
			@ApiParam(value = "Position of the current operation in the trace tree. The value is 64 bits long. Do not integererpret the value it may or may not be derived from the value of the TraceId.") @RequestHeader(value = "X-B3-SpanId", required = false) String xB3SpanId,
			@ApiParam(value = "Sampling decision. Sampling is a mechanism to reduce the volume of data in the tracing system. In B3, sampling applies consistently per-trace: once the sampling decision is made, the same value must be consistently sent downstream. This means that either all or no spans share a trace ID.  The possible values are 0 = Deny 1 = Accept d = Debug") @RequestHeader(value = "X-B3-Sampled", required = false) String xB3Sampled) {
		String accept1 = request.getHeader("Accept");
		if (accept1 != null && accept1.contains("application/json")) {
			try {
				String jsonStr = generateJsonStrFromResponseService(user, password, vehicleType, manufacturerId, null);
				return new ResponseEntity<VehiclesResponse>(objectMapper.readValue(jsonStr, VehiclesResponse.class),
						HttpStatus.OK);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<VehiclesResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<VehiclesResponse>(HttpStatus.NOT_IMPLEMENTED);
	}
    
	public ResponseEntity<VehiclesResponse> getVehiclesByType(
//			@ApiParam(value = "include context object", required = true) @RequestHeader(value = "Context", required = true) String context,
//			@ApiParam(value = "Authorization token. Bearer OAuth2 token", required = true) @RequestHeader(value = "Authorization", required = true) String authorization,
			@ApiParam(value = "metadata content type", required = true, defaultValue = "application/json") @RequestHeader(value = "Content-Type", required = true, defaultValue = "application/json") String contentType,
			@ApiParam(value = "Client Id header", required = true) @RequestHeader(value = "X-Santander-Client-Id", required = true) String xSantanderClientId,
			@ApiParam(value = "The server response", required = true, defaultValue = "application/json") @RequestHeader(value = "Accept", required = true, defaultValue = "application/json") String accept,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "User", required = true) String user,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "Password", required = true) String password,
			@ApiParam(value = "C car, M moto", required = true) @PathVariable("VehicleType") Character vehicleType,
			@ApiParam(value = "Overall ID of the trace, shared by every span in the trace. The value is 64 or 128 bits long.") @RequestHeader(value = "X-B3-TraceId", required = false) String xB3TraceId,
			@ApiParam(value = "Position of the parent operation in the trace tree. The value is 64 bits long. value is omitted when the span is the root of the trace tree. ") @RequestHeader(value = "X-B3-ParentSpanId", required = false) String xB3ParentSpanId,
			@ApiParam(value = "Position of the current operation in the trace tree. The value is 64 bits long. Do not integererpret the value it may or may not be derived from the value of the TraceId.") @RequestHeader(value = "X-B3-SpanId", required = false) String xB3SpanId,
			@ApiParam(value = "Sampling decision. Sampling is a mechanism to reduce the volume of data in the tracing system. In B3, sampling applies consistently per-trace: once the sampling decision is made, the same value must be consistently sent downstream. This means that either all or no spans share a trace ID.  The possible values are 0 = Deny 1 = Accept d = Debug") @RequestHeader(value = "X-B3-Sampled", required = false) String xB3Sampled) {
		String accept1 = request.getHeader("Accept");
		if (accept1 != null && accept1.contains("application/json")) {
			try {
				String jsonStr = generateJsonStrFromResponseService(user, password, vehicleType, null, null);
				return new ResponseEntity<VehiclesResponse>(objectMapper.readValue(jsonStr, VehiclesResponse.class),
						HttpStatus.OK);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<VehiclesResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<VehiclesResponse>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<VehiclesResponse> getVehiclesByTypeAndManufacturerAndModel(
//			@ApiParam(value = "include context object", required = true) @RequestHeader(value = "Context", required = true) String context,
//			@ApiParam(value = "Authorization token. Bearer OAuth2 token", required = true) @RequestHeader(value = "Authorization", required = true) String authorization,
			@ApiParam(value = "metadata content type", required = true, defaultValue = "application/json") @RequestHeader(value = "Content-Type", required = true, defaultValue = "application/json") String contentType,
			@ApiParam(value = "Client Id header", required = true) @RequestHeader(value = "X-Santander-Client-Id", required = true) String xSantanderClientId,
			@ApiParam(value = "The server response", required = true, defaultValue = "application/json") @RequestHeader(value = "Accept", required = true, defaultValue = "application/json") String accept,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "User", required = true) String user,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "Password", required = true) String password,
			@ApiParam(value = "C car, M moto", required = true) @PathVariable("VehicleType") Character vehicleType,
			@ApiParam(value = "", required = true) @PathVariable("ManufacturerId") String manufacturerId,
			@ApiParam(value = "", required = true) @PathVariable("ModelId") String modelId,
			@ApiParam(value = "Overall ID of the trace, shared by every span in the trace. The value is 64 or 128 bits long.") @RequestHeader(value = "X-B3-TraceId", required = false) String xB3TraceId,
			@ApiParam(value = "Position of the parent operation in the trace tree. The value is 64 bits long. value is omitted when the span is the root of the trace tree. ") @RequestHeader(value = "X-B3-ParentSpanId", required = false) String xB3ParentSpanId,
			@ApiParam(value = "Position of the current operation in the trace tree. The value is 64 bits long. Do not integererpret the value it may or may not be derived from the value of the TraceId.") @RequestHeader(value = "X-B3-SpanId", required = false) String xB3SpanId,
			@ApiParam(value = "Sampling decision. Sampling is a mechanism to reduce the volume of data in the tracing system. In B3, sampling applies consistently per-trace: once the sampling decision is made, the same value must be consistently sent downstream. This means that either all or no spans share a trace ID.  The possible values are 0 = Deny 1 = Accept d = Debug") @RequestHeader(value = "X-B3-Sampled", required = false) String xB3Sampled) {
		String accept1 = request.getHeader("Accept");
		if (accept1 != null && accept1.contains("application/json")) {
			try {
				String jsonStr = generateJsonStrFromResponseService(user, password, vehicleType, manufacturerId, modelId);
				return new ResponseEntity<VehiclesResponse>(objectMapper.readValue(jsonStr, VehiclesResponse.class),
						HttpStatus.OK);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<VehiclesResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<VehiclesResponse>(HttpStatus.NOT_IMPLEMENTED);
	}
	
    
	private String generateJsonStrFromResponseService(String user, String password, Character vehicleType,
			String manufacturerId, String modelId) throws JsonProcessingException {
		ObjectFactory objFactory = new ObjectFactory();
		GetVehicles vehiclesRequest = new GetVehicles();
		vehiclesRequest.setUserId(user);
		vehiclesRequest.setPassword(password);
		vehiclesRequest.setVehicleType(String.valueOf(vehicleType));
		if (null != manufacturerId)
			vehiclesRequest.setManufacturerId(manufacturerId);
		if (null != modelId)
			vehiclesRequest.setModelId(modelId);
		GetVehiclesResponse vehiclesResponse = objFactory.createGetVehiclesResponse();
		vehiclesResponse = giwsClient.vehiclesResponse(vehiclesRequest);
		String jsonStr = objectMapper.writeValueAsString(vehiclesResponse);
		return jsonStr;
	}


	public ResponseEntity<String> dummyMethod() {
		try {
			String ip = InetAddress.getLocalHost().getHostAddress();
			System.out.println("host-ip " + ip);
		} catch (UnknownHostException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		return new ResponseEntity<String>("Hola mundo",HttpStatus.OK);
	}

}
